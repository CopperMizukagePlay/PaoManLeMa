package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p013b4.C0283a;
import p013b4.C0285c;
import p013b4.InterfaceC0286d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0283a(0);

    /* renamed from: e */
    public final InterfaceC0286d f892e;

    public ParcelImpl(Parcel parcel) {
        this.f892e = new C0285c(parcel).m625g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new C0285c(parcel).m627i(this.f892e);
    }
}
