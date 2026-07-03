package p160v;

import android.os.Parcel;
import android.os.Parcelable;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.f */
/* loaded from: classes.dex */
public final class C3408f implements Parcelable {
    public static final Parcelable.Creator<C3408f> CREATOR = new Object();

    /* renamed from: e */
    public final int f16539e;

    public C3408f(int i7) {
        this.f16539e = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3408f) && this.f16539e == ((C3408f) obj).f16539e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16539e);
    }

    public final String toString() {
        return AbstractC2487d.m4045i(new StringBuilder("DefaultLazyKey(index="), this.f16539e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f16539e);
    }
}
