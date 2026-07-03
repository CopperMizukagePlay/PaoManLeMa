package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p013b4.AbstractC0284b;
import p013b4.C0285c;
import p013b4.InterfaceC0286d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0284b abstractC0284b) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0286d interfaceC0286d = remoteActionCompat.f797a;
        boolean z7 = true;
        if (abstractC0284b.mo623e(1)) {
            interfaceC0286d = abstractC0284b.m625g();
        }
        remoteActionCompat.f797a = (IconCompat) interfaceC0286d;
        CharSequence charSequence = remoteActionCompat.f798b;
        if (abstractC0284b.mo623e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0285c) abstractC0284b).f1037e);
        }
        remoteActionCompat.f798b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f799c;
        if (abstractC0284b.mo623e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0285c) abstractC0284b).f1037e);
        }
        remoteActionCompat.f799c = charSequence2;
        remoteActionCompat.f800d = (PendingIntent) abstractC0284b.m624f(remoteActionCompat.f800d, 4);
        boolean z8 = remoteActionCompat.f801e;
        if (abstractC0284b.mo623e(5)) {
            if (((C0285c) abstractC0284b).f1037e.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        remoteActionCompat.f801e = z8;
        boolean z9 = remoteActionCompat.f802f;
        if (!abstractC0284b.mo623e(6)) {
            z7 = z9;
        } else if (((C0285c) abstractC0284b).f1037e.readInt() == 0) {
            z7 = false;
        }
        remoteActionCompat.f802f = z7;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0284b abstractC0284b) {
        abstractC0284b.getClass();
        IconCompat iconCompat = remoteActionCompat.f797a;
        abstractC0284b.mo626h(1);
        abstractC0284b.m627i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f798b;
        abstractC0284b.mo626h(2);
        Parcel parcel = ((C0285c) abstractC0284b).f1037e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f799c;
        abstractC0284b.mo626h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f800d;
        abstractC0284b.mo626h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z7 = remoteActionCompat.f801e;
        abstractC0284b.mo626h(5);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = remoteActionCompat.f802f;
        abstractC0284b.mo626h(6);
        parcel.writeInt(z8 ? 1 : 0);
    }
}
