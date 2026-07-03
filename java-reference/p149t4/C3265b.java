package p149t4;

import p001a0.C0031h1;
import p022c4.C0400j;
import p067i4.C2068a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t4.b */
/* loaded from: classes.dex */
public final class C3265b extends AbstractC3267d {

    /* renamed from: c */
    public final /* synthetic */ int f16112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3265b(C2068a c2068a, int i7) {
        super(c2068a);
        this.f16112c = i7;
    }

    @Override // p149t4.AbstractC3269f
    /* renamed from: d */
    public final String mo4976d() {
        switch (this.f16112c) {
            case 0:
                C0031h1 c0031h1 = (C0031h1) this.f16116b;
                if (((C2068a) this.f16115a).f12257f >= 48) {
                    StringBuilder sb = new StringBuilder();
                    m4979f(sb, 8);
                    int m76s = C0031h1.m76s(48, 2, (C2068a) c0031h1.f152f);
                    sb.append("(392");
                    sb.append(m76s);
                    sb.append(')');
                    sb.append(c0031h1.m102p(null, 50).f16118b);
                    return sb.toString();
                }
                throw C0400j.m878a();
            case 1:
                C0031h1 c0031h12 = (C0031h1) this.f16116b;
                if (((C2068a) this.f16115a).f12257f >= 48) {
                    StringBuilder sb2 = new StringBuilder();
                    m4979f(sb2, 8);
                    int m76s2 = C0031h1.m76s(48, 2, (C2068a) c0031h12.f152f);
                    sb2.append("(393");
                    sb2.append(m76s2);
                    sb2.append(')');
                    int m76s3 = C0031h1.m76s(50, 10, (C2068a) c0031h12.f152f);
                    if (m76s3 / 100 == 0) {
                        sb2.append('0');
                    }
                    if (m76s3 / 10 == 0) {
                        sb2.append('0');
                    }
                    sb2.append(m76s3);
                    sb2.append(c0031h12.m102p(null, 60).f16118b);
                    return sb2.toString();
                }
                throw C0400j.m878a();
            default:
                StringBuilder sb3 = new StringBuilder();
                sb3.append("(01)");
                int length = sb3.length();
                C0031h1 c0031h13 = (C0031h1) this.f16116b;
                sb3.append(C0031h1.m76s(4, 4, (C2068a) c0031h13.f152f));
                m4980g(sb3, 8, length);
                return c0031h13.m101o(sb3, 48);
        }
    }
}
