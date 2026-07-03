package p149t4;

import p001a0.C0031h1;
import p022c4.C0400j;
import p067i4.C2068a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t4.c */
/* loaded from: classes.dex */
public final class C3266c extends AbstractC3268e {

    /* renamed from: c */
    public final String f16113c;

    /* renamed from: d */
    public final String f16114d;

    public C3266c(C2068a c2068a, String str, String str2) {
        super(c2068a);
        this.f16113c = str2;
        this.f16114d = str;
    }

    @Override // p149t4.AbstractC3269f
    /* renamed from: d */
    public final String mo4976d() {
        if (((C2068a) this.f16115a).f12257f == 84) {
            StringBuilder sb = new StringBuilder();
            m4979f(sb, 8);
            m4981j(sb, 48, 20);
            int m76s = C0031h1.m76s(68, 16, (C2068a) ((C0031h1) this.f16116b).f152f);
            if (m76s != 38400) {
                sb.append('(');
                sb.append(this.f16113c);
                sb.append(')');
                int i7 = m76s % 32;
                int i8 = m76s / 32;
                int i9 = (i8 % 12) + 1;
                int i10 = i8 / 12;
                if (i10 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i10);
                if (i9 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i9);
                if (i7 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i7);
            }
            return sb.toString();
        }
        throw C0400j.m878a();
    }

    @Override // p149t4.AbstractC3268e
    /* renamed from: h */
    public final void mo4977h(StringBuilder sb, int i7) {
        sb.append('(');
        sb.append(this.f16114d);
        sb.append(i7 / 100000);
        sb.append(')');
    }

    @Override // p149t4.AbstractC3268e
    /* renamed from: i */
    public final int mo4978i(int i7) {
        return i7 % 100000;
    }
}
