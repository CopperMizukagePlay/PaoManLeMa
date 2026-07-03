package p161v0;

import android.os.Parcel;
import android.os.Parcelable;
import p116p0.C2837f;
import p116p0.C2840i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.o */
/* loaded from: classes.dex */
public final class C3468o implements Parcelable.ClassLoaderCreator {
    /* renamed from: a */
    public static C3469p m5258a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = C3468o.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new C3469p();
        }
        C2837f mo4458e = C2840i.f14929f.mo4458e();
        for (int i7 = 0; i7 < readInt; i7++) {
            mo4458e.add(parcel.readValue(classLoader));
        }
        return new C3469p(mo4458e.m4477c());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m5258a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new C3469p[i7];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m5258a(parcel, null);
    }
}
