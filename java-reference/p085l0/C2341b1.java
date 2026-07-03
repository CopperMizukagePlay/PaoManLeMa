package p085l0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.b1 */
/* loaded from: classes.dex */
public final class C2341b1 implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f13341a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f13341a) {
            case 0:
                return new C2345c1(parcel.readFloat());
            case 1:
                return new C2349d1(parcel.readInt());
            default:
                return new C2353e1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f13341a) {
            case 0:
                return new C2345c1[i7];
            case 1:
                return new C2349d1[i7];
            default:
                return new C2353e1[i7];
        }
    }
}
