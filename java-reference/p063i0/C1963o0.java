package p063i0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;
import p027d1.C0467e;
import p035e1.C0660j;
import p035e1.C0662k;
import p035e1.C0677s;
import p049g1.C1573g;
import p049g1.C1574h;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p068i5.AbstractC2080d;
import p085l0.InterfaceC2390n2;
import p144t.AbstractC3144n;
import p144t.C3148p;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p158u5.C3377t;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.o0 */
/* loaded from: classes.dex */
public final class C1963o0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f11592f;

    /* renamed from: g */
    public final /* synthetic */ Object f11593g;

    /* renamed from: h */
    public final /* synthetic */ Object f11594h;

    /* renamed from: i */
    public final /* synthetic */ Object f11595i;

    /* renamed from: j */
    public final /* synthetic */ Object f11596j;

    /* renamed from: k */
    public final /* synthetic */ Object f11597k;

    /* renamed from: l */
    public final /* synthetic */ Object f11598l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1963o0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        super(1);
        this.f11592f = i7;
        this.f11593g = obj;
        this.f11594h = obj2;
        this.f11595i = obj3;
        this.f11596j = obj4;
        this.f11597k = obj5;
        this.f11598l = obj6;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        float f7;
        float f8;
        Path path;
        switch (this.f11592f) {
            case 0:
                InterfaceC1570d interfaceC1570d = (InterfaceC1570d) obj;
                float floor = (float) Math.floor(interfaceC1570d.mo4526y(AbstractC1987r0.f11710c));
                long j6 = ((C0677s) ((InterfaceC2390n2) this.f11593g).getValue()).f2211a;
                long j7 = ((C0677s) ((InterfaceC2390n2) this.f11594h).getValue()).f2211a;
                float mo4526y = interfaceC1570d.mo4526y(AbstractC1987r0.f11711d);
                float f9 = floor / 2.0f;
                C1574h c1574h = new C1574h(floor, 0.0f, 0, 0, 30);
                float m1026d = C0467e.m1026d(interfaceC1570d.mo2546c());
                boolean m1454c = C0677s.m1454c(j6, j7);
                C1573g c1573g = C1573g.f10187a;
                if (m1454c) {
                    InterfaceC1570d.m2536F(interfaceC1570d, j6, 0L, AbstractC1793a0.m2975c(m1026d, m1026d), AbstractC1793a0.m2974b(mo4526y), c1573g, 226);
                    f8 = floor;
                    f7 = 0.0f;
                } else {
                    long m5797a = AbstractC3784a.m5797a(floor, floor);
                    float f10 = m1026d - (2 * floor);
                    long m2975c = AbstractC1793a0.m2975c(f10, f10);
                    long m2974b = AbstractC1793a0.m2974b(Math.max(0.0f, mo4526y - floor));
                    f7 = 0.0f;
                    f8 = floor;
                    InterfaceC1570d.m2536F(interfaceC1570d, j6, m5797a, m2975c, m2974b, c1573g, 224);
                    float f11 = m1026d - f8;
                    InterfaceC1570d.m2536F(interfaceC1570d, j7, AbstractC3784a.m5797a(f9, f9), AbstractC1793a0.m2975c(f11, f11), AbstractC1793a0.m2974b(mo4526y - f9), c1574h, 224);
                }
                long j8 = ((C0677s) ((InterfaceC2390n2) this.f11595i).getValue()).f2211a;
                float floatValue = ((Number) ((InterfaceC2390n2) this.f11596j).getValue()).floatValue();
                float floatValue2 = ((Number) ((InterfaceC2390n2) this.f11597k).getValue()).floatValue();
                C1931k0 c1931k0 = (C1931k0) this.f11598l;
                C1574h c1574h2 = new C1574h(f8, 0.0f, 2, 0, 26);
                float m1026d2 = C0467e.m1026d(interfaceC1570d.mo2546c());
                float m3409v = AbstractC2080d.m3409v(0.4f, 0.5f, floatValue2);
                float m3409v2 = AbstractC2080d.m3409v(0.7f, 0.5f, floatValue2);
                float m3409v3 = AbstractC2080d.m3409v(0.5f, 0.5f, floatValue2);
                float m3409v4 = AbstractC2080d.m3409v(0.3f, 0.5f, floatValue2);
                c1931k0.f11413a.m1431e();
                C0660j c0660j = c1931k0.f11413a;
                c0660j.f2151a.moveTo(0.2f * m1026d2, m3409v3 * m1026d2);
                c0660j.m1429c(m3409v * m1026d2, m3409v2 * m1026d2);
                c0660j.m1429c(0.8f * m1026d2, m1026d2 * m3409v4);
                C0662k c0662k = c1931k0.f11414b;
                PathMeasure pathMeasure = c0662k.f2173a;
                if (c0660j != null) {
                    path = c0660j.f2151a;
                } else {
                    path = null;
                }
                pathMeasure.setPath(path, false);
                C0660j c0660j2 = c1931k0.f11415c;
                c0660j2.m1431e();
                c0662k.m1443a(f7, c0662k.f2173a.getLength() * floatValue, c0660j2);
                InterfaceC1570d.m2539P(interfaceC1570d, c1931k0.f11415c, j8, c1574h2, 52);
                return C1694m.f10482a;
            default:
                AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
                AbstractC3239v0[] abstractC3239v0Arr = (AbstractC3239v0[]) this.f11593g;
                List list = (List) this.f11594h;
                InterfaceC3223n0 interfaceC3223n0 = (InterfaceC3223n0) this.f11595i;
                C3377t c3377t = (C3377t) this.f11596j;
                C3377t c3377t2 = (C3377t) this.f11597k;
                C3148p c3148p = (C3148p) this.f11598l;
                int length = abstractC3239v0Arr.length;
                int i7 = 0;
                int i8 = 0;
                while (i8 < length) {
                    AbstractC3239v0 abstractC3239v0 = abstractC3239v0Arr[i8];
                    AbstractC3367j.m5098c(abstractC3239v0, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    AbstractC3144n.m4850b(abstractC3237u0, abstractC3239v0, (InterfaceC3214k0) list.get(i7), interfaceC3223n0.getLayoutDirection(), c3377t.f16449e, c3377t2.f16449e, c3148p.f15823a);
                    i8++;
                    i7++;
                }
                return C1694m.f10482a;
        }
    }
}
