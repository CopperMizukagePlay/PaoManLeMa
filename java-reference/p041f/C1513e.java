package p041f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import p013b4.C0283a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f.e */
/* loaded from: classes.dex */
public final class C1513e implements Parcelable {
    public static final Parcelable.Creator<C1513e> CREATOR = new C0283a(2);

    /* renamed from: e */
    public final IntentSender f10001e;

    /* renamed from: f */
    public final Intent f10002f;

    /* renamed from: g */
    public final int f10003g;

    /* renamed from: h */
    public final int f10004h;

    public C1513e(Parcel parcel) {
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        AbstractC3367j.m5097b(readParcelable);
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.f10001e = (IntentSender) readParcelable;
        this.f10002f = intent;
        this.f10003g = readInt;
        this.f10004h = readInt2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC3367j.m5100e(parcel, "dest");
        parcel.writeParcelable(this.f10001e, i7);
        parcel.writeParcelable(this.f10002f, i7);
        parcel.writeInt(this.f10003g);
        parcel.writeInt(this.f10004h);
    }
}
