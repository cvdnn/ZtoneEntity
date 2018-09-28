package android.entity;

import android.io.IParcelable;
import android.os.Parcel;

/**
 * Created by handy on 17-1-20.
 */

public class PullFlag extends IParcelable {
    public int flag;

    public PullFlag() {

    }

    public PullFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public PullFlag readFromParcel(Parcel src) {
        if (src != null) {
            flag = src.readInt();
        }

        return this;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (dest != null) {
            dest.writeInt(flag);
        }
    }

    public static final Creator<PullFlag> CREATOR = new Creator<PullFlag>() {

        @Override
        public PullFlag createFromParcel(Parcel source) {

            return new PullFlag().readFromParcel(source);
        }

        @Override
        public PullFlag[] newArray(int size) {

            return new PullFlag[size];
        }
    };
}
