package com.company;

public class GSCanvas {
    short mArray[];
    int mWidth,mHeight;
    final String mMapping = "█▉▊▋▓▩▦▤▧▨◉▣◈▒░$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~<>i!lI;:,\"^`'. ";
    public GSCanvas(int width,int height) {
        mArray = new short[width*height];
        mWidth = width;
        mHeight = height;
    }
    public GSCanvas(short array[],int width,int height) {
        mArray = array.clone();
        mWidth = width;
        mHeight = height;
    }
    public void set(int x,int y,short gsvalue) {
        if ( x >= 0 && x < mWidth && y >= 0 && y < mHeight ) {
            mArray[y * mWidth + x] = gsvalue;
        }
    }
    public void fillRect(int x0,int y0,int w,int h,short gsvalue) {
        for ( int y = y0; y < y0 + h; y++ ) {
            for ( int x = x0; x < x0 + w; x++ ) {
                set(x,y,gsvalue);
            }
        }
    }
    public short get(int x,int y) {
        if ( x >= 0 && x < mWidth && y >= 0 && y < mHeight ) {
            return mArray[y * mWidth + x];
        }
        return 0;
    }
    public String render() {
        StringBuffer stringBuffer = new StringBuffer();
        for ( int i = 0; i < mArray.length; i++ ) {
            if ( i != 0 && i % mWidth == 0 ) {
                stringBuffer.append('\n');
            }
            stringBuffer.append(gs2unicode(mArray[i]));
        }
        return stringBuffer.toString();
    }

    public char gs2unicode(int value255) {
        int length = mMapping.length();
        double percent = value255 / 255.0;
        int position = (int)(percent * (length-1));
        return mMapping.charAt(position);
    }

    public void average() {
        short newArray[] = new short[mWidth * mHeight];
        for ( int y = 0; y < mHeight; y++ ) {
            for ( int x = 0; x < mWidth; x++ ) {
                //int sum = get(x-1,y-1) + get(x,y-1) + get(x+1,y-1) + get(x-1,y) + get(x+1,y) + get(x-1,y+1) + get(x,y+1) + get(x+1,y+1);
                int sum = get(x-1,y-1) + get(x,y-1) + get(x+1,y-1) + get(x-1,y) + get(x+1,y) + get(x-1,y+1) + get(x,y+1) + get(x+1,y+1)
                        + get(x-1,y+2) + get(x,y+2) + get(x+1,y+2);
                int average = sum / 11;
                newArray[y*mWidth+x] = (short)average;
            }
        }
        mArray = newArray;
    }
}
