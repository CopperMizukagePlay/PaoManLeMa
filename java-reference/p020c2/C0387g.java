package p020c2;

import p053g5.C1694m;
import p058h2.AbstractC1770g;
import p058h2.C1773j;
import p060h5.AbstractC1793a0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c2.g */
/* loaded from: classes.dex */
public final class C0387g {

    /* renamed from: a */
    public int f1308a;

    /* renamed from: b */
    public float f1309b;

    /* renamed from: c */
    public final Object f1310c;

    public C0387g(int i7, C0383c c0383c) {
        this.f1308a = i7;
        this.f1310c = c0383c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float m856a(int i7, boolean z7, boolean z8, boolean z9) {
        boolean z10;
        int i8;
        float m2936i;
        C1773j c1773j = (C1773j) this.f1310c;
        int i9 = 1;
        if (z7) {
            int m2925d = AbstractC1770g.m2925d(c1773j.f10797f, i7, z7);
            int lineStart = c1773j.f10797f.getLineStart(m2925d);
            int m2933f = c1773j.m2933f(m2925d);
            if (i7 == lineStart || i7 == m2933f) {
                z10 = true;
                int i10 = i7 * 4;
                if (!z9) {
                    if (z10) {
                        i9 = 0;
                    }
                } else if (z10) {
                    i9 = 2;
                } else {
                    i9 = 3;
                }
                i8 = i10 + i9;
                if (this.f1308a != i8) {
                    return this.f1309b;
                }
                if (z9) {
                    m2936i = c1773j.m2935h(i7, z7);
                } else {
                    m2936i = c1773j.m2936i(i7, z7);
                }
                if (z8) {
                    this.f1308a = i8;
                    this.f1309b = m2936i;
                }
                return m2936i;
            }
        }
        z10 = false;
        int i102 = i7 * 4;
        if (!z9) {
        }
        i8 = i102 + i9;
        if (this.f1308a != i8) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m857b(float f7, AbstractC2583c abstractC2583c) {
        C0386f c0386f;
        int i7;
        if (abstractC2583c instanceof C0386f) {
            c0386f = (C0386f) abstractC2583c;
            int i8 = c0386f.f1307j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0386f.f1307j = i8 - Integer.MIN_VALUE;
                Object obj = c0386f.f1305h;
                i7 = c0386f.f1307j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0383c c0383c = (C0383c) this.f1310c;
                    Float f8 = new Float(f7);
                    c0386f.f1307j = 1;
                    obj = c0383c.mo22d(f8, c0386f);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                }
                this.f1309b += ((Number) obj).floatValue();
                return C1694m.f10482a;
            }
        }
        c0386f = new C0386f(this, abstractC2583c);
        Object obj2 = c0386f.f1305h;
        i7 = c0386f.f1307j;
        if (i7 == 0) {
        }
        this.f1309b += ((Number) obj2).floatValue();
        return C1694m.f10482a;
    }

    public C0387g(C1773j c1773j) {
        this.f1310c = c1773j;
        this.f1308a = -1;
    }
}
