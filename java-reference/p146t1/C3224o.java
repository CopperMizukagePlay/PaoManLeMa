package p146t1;

import java.io.Serializable;
import p060h5.AbstractC1804l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.o */
/* loaded from: classes.dex */
public final class C3224o {

    /* renamed from: a */
    public final /* synthetic */ int f16015a;

    /* renamed from: b */
    public final C3222n f16016b;

    /* renamed from: c */
    public final C3222n f16017c;

    /* renamed from: d */
    public final C3222n f16018d;

    /* renamed from: e */
    public final C3222n f16019e;

    /* renamed from: f */
    public final Serializable f16020f;

    public C3224o(String str) {
        this.f16015a = 1;
        this.f16020f = str;
        this.f16016b = new C3222n(1, null);
        this.f16017c = new C3222n(0, null);
        this.f16018d = new C3222n(1, null);
        this.f16019e = new C3222n(0, null);
    }

    /* renamed from: a */
    public final C3222n m4942a() {
        switch (this.f16015a) {
            case 0:
                return this.f16019e;
            default:
                return this.f16019e;
        }
    }

    /* renamed from: b */
    public final C3222n m4943b() {
        switch (this.f16015a) {
            case 0:
                return this.f16016b;
            default:
                return this.f16016b;
        }
    }

    /* renamed from: c */
    public final C3222n m4944c() {
        switch (this.f16015a) {
            case 0:
                return this.f16018d;
            default:
                return this.f16018d;
        }
    }

    /* renamed from: d */
    public final C3222n m4945d() {
        switch (this.f16015a) {
            case 0:
                return this.f16017c;
            default:
                return this.f16017c;
        }
    }

    public final String toString() {
        switch (this.f16015a) {
            case 0:
                return AbstractC1804l.m3029V(57, (C3224o[]) this.f16020f);
            default:
                String str = (String) this.f16020f;
                if (str != null) {
                    return "RectRulers(" + str + ')';
                }
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3224o(C3224o[] c3224oArr) {
        this.f16015a = 0;
        this.f16020f = c3224oArr;
        int length = c3224oArr.length;
        C3222n[] c3222nArr = new C3222n[length];
        for (int i7 = 0; i7 < length; i7++) {
            c3222nArr[i7] = ((C3224o[]) this.f16020f)[i7].m4943b();
        }
        this.f16016b = new C3222n(1, new C3209i1(c3222nArr, 0));
        int length2 = ((C3224o[]) this.f16020f).length;
        C3222n[] c3222nArr2 = new C3222n[length2];
        for (int i8 = 0; i8 < length2; i8++) {
            c3222nArr2[i8] = ((C3224o[]) this.f16020f)[i8].m4945d();
        }
        this.f16017c = new C3222n(0, new C3219m(c3222nArr2, 0));
        int length3 = ((C3224o[]) this.f16020f).length;
        C3222n[] c3222nArr3 = new C3222n[length3];
        for (int i9 = 0; i9 < length3; i9++) {
            c3222nArr3[i9] = ((C3224o[]) this.f16020f)[i9].m4944c();
        }
        this.f16018d = new C3222n(1, new C3209i1(c3222nArr3, 1));
        int length4 = ((C3224o[]) this.f16020f).length;
        C3222n[] c3222nArr4 = new C3222n[length4];
        for (int i10 = 0; i10 < length4; i10++) {
            c3222nArr4[i10] = ((C3224o[]) this.f16020f)[i10].m4942a();
        }
        this.f16019e = new C3222n(0, new C3219m(c3222nArr4, 1));
    }
}
