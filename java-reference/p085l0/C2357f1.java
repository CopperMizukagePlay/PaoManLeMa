package p085l0;

import android.os.Parcel;
import android.os.Parcelable;
import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.f1 */
/* loaded from: classes.dex */
public final class C2357f1 implements Parcelable.ClassLoaderCreator {
    /* renamed from: a */
    public static C2361g1 m3795a(Parcel parcel, ClassLoader classLoader) {
        C2413u0 c2413u0;
        if (classLoader == null) {
            classLoader = C2357f1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    c2413u0 = C2413u0.f13573h;
                } else {
                    throw new IllegalStateException(AbstractC0094y0.m184k(readInt, "Unsupported MutableState policy ", " was restored"));
                }
            } else {
                c2413u0 = C2413u0.f13575j;
            }
        } else {
            c2413u0 = C2413u0.f13572g;
        }
        return new C2361g1(readValue, c2413u0);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m3795a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new C2361g1[i7];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return m3795a(parcel, null);
    }
}
