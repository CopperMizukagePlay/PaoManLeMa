package p013b4;

import android.os.Parcel;
import android.util.SparseIntArray;
import p077k.C2189f;
import p077k.C2214r0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b4.c */
/* loaded from: classes.dex */
public final class C0285c extends AbstractC0284b {

    /* renamed from: d */
    public final SparseIntArray f1036d;

    /* renamed from: e */
    public final Parcel f1037e;

    /* renamed from: f */
    public final int f1038f;

    /* renamed from: g */
    public final int f1039g;

    /* renamed from: h */
    public final String f1040h;

    /* renamed from: i */
    public int f1041i;

    /* renamed from: j */
    public int f1042j;

    /* renamed from: k */
    public int f1043k;

    /* JADX WARN: Type inference failed for: r5v0, types: [k.r0, k.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [k.r0, k.f] */
    /* JADX WARN: Type inference failed for: r7v0, types: [k.r0, k.f] */
    public C0285c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2214r0(), new C2214r0(), new C2214r0());
    }

    @Override // p013b4.AbstractC0284b
    /* renamed from: a */
    public final C0285c mo619a() {
        Parcel parcel = this.f1037e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f1042j;
        if (i7 == this.f1038f) {
            i7 = this.f1039g;
        }
        return new C0285c(parcel, dataPosition, i7, AbstractC2487d.m4046j(new StringBuilder(), this.f1040h, "  "), this.f1033a, this.f1034b, this.f1035c);
    }

    @Override // p013b4.AbstractC0284b
    /* renamed from: e */
    public final boolean mo623e(int i7) {
        while (this.f1042j < this.f1039g) {
            int i8 = this.f1043k;
            if (i8 != i7) {
                if (String.valueOf(i8).compareTo(String.valueOf(i7)) <= 0) {
                    int i9 = this.f1042j;
                    Parcel parcel = this.f1037e;
                    parcel.setDataPosition(i9);
                    int readInt = parcel.readInt();
                    this.f1043k = parcel.readInt();
                    this.f1042j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f1043k == i7) {
            return true;
        }
        return false;
    }

    @Override // p013b4.AbstractC0284b
    /* renamed from: h */
    public final void mo626h(int i7) {
        int i8 = this.f1041i;
        SparseIntArray sparseIntArray = this.f1036d;
        Parcel parcel = this.f1037e;
        if (i8 >= 0) {
            int i9 = sparseIntArray.get(i8);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(dataPosition - i9);
            parcel.setDataPosition(dataPosition);
        }
        this.f1041i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public C0285c(Parcel parcel, int i7, int i8, String str, C2189f c2189f, C2189f c2189f2, C2189f c2189f3) {
        super(c2189f, c2189f2, c2189f3);
        this.f1036d = new SparseIntArray();
        this.f1041i = -1;
        this.f1043k = -1;
        this.f1037e = parcel;
        this.f1038f = i7;
        this.f1039g = i8;
        this.f1042j = i7;
        this.f1040h = str;
    }
}
