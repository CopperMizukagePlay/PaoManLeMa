package p013b4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import p041f.C1509a;
import p041f.C1513e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b4.a */
/* loaded from: classes.dex */
public final class C0283a implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f1032a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intent intent;
        switch (this.f1032a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                AbstractC3367j.m5100e(parcel, "parcel");
                int readInt = parcel.readInt();
                if (parcel.readInt() == 0) {
                    intent = null;
                } else {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                return new C1509a(intent, readInt);
            default:
                AbstractC3367j.m5100e(parcel, "inParcel");
                return new C1513e(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f1032a) {
            case 0:
                return new ParcelImpl[i7];
            case 1:
                return new C1509a[i7];
            default:
                return new C1513e[i7];
        }
    }
}
