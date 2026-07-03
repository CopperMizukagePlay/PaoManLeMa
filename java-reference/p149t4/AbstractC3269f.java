package p149t4;

import p001a0.C0031h1;
import p067i4.C2068a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t4.f */
/* loaded from: classes.dex */
public abstract class AbstractC3269f {

    /* renamed from: a */
    public Object f16115a;

    /* renamed from: b */
    public final Object f16116b;

    public AbstractC3269f(C2068a c2068a) {
        this.f16115a = c2068a;
        this.f16116b = new C0031h1(c2068a);
    }

    /* renamed from: a */
    public abstract int[] mo4982a(int i7);

    /* renamed from: b */
    public int[] m4983b(int i7, int i8) {
        if (i7 >= 0 && i8 >= 0 && i7 != i8) {
            int[] iArr = (int[]) this.f16116b;
            iArr[0] = i7;
            iArr[1] = i8;
            return iArr;
        }
        return null;
    }

    /* renamed from: c */
    public String m4984c() {
        String str = (String) this.f16115a;
        if (str != null) {
            return str;
        }
        AbstractC3367j.m5105j("text");
        throw null;
    }

    /* renamed from: d */
    public abstract String mo4976d();

    /* renamed from: e */
    public abstract int[] mo4985e(int i7);

    public AbstractC3269f() {
        this.f16116b = new int[2];
    }
}
