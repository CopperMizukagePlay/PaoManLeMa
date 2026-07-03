package p149t4;

import p001a0.C0031h1;
import p067i4.C2068a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t4.d */
/* loaded from: classes.dex */
public abstract class AbstractC3267d extends AbstractC3269f {
    /* renamed from: f */
    public final void m4979f(StringBuilder sb, int i7) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        m4980g(sb, i7, length);
    }

    /* renamed from: g */
    public final void m4980g(StringBuilder sb, int i7, int i8) {
        int i9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            int m76s = C0031h1.m76s((i10 * 10) + i7, 10, (C2068a) ((C0031h1) this.f16116b).f152f);
            if (m76s / 100 == 0) {
                sb.append('0');
            }
            if (m76s / 10 == 0) {
                sb.append('0');
            }
            sb.append(m76s);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 13; i12++) {
            int charAt = sb.charAt(i12 + i8) - '0';
            if ((i12 & 1) == 0) {
                charAt *= 3;
            }
            i11 += charAt;
        }
        int i13 = 10 - (i11 % 10);
        if (i13 != 10) {
            i9 = i13;
        }
        sb.append(i9);
    }
}
