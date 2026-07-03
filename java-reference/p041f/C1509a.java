package p041f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p013b4.C0283a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f.a */
/* loaded from: classes.dex */
public final class C1509a implements Parcelable {
    public static final Parcelable.Creator<C1509a> CREATOR = new C0283a(1);

    /* renamed from: e */
    public final int f9994e;

    /* renamed from: f */
    public final Intent f9995f;

    public C1509a(Intent intent, int i7) {
        this.f9994e = i7;
        this.f9995f = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f9994e;
        if (i7 != -1) {
            if (i7 != 0) {
                str = String.valueOf(i7);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f9995f);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8;
        AbstractC3367j.m5100e(parcel, "dest");
        parcel.writeInt(this.f9994e);
        Intent intent = this.f9995f;
        if (intent == null) {
            i8 = 0;
        } else {
            i8 = 1;
        }
        parcel.writeInt(i8);
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }
}
