package p039e5;

import java.util.List;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3465l;
import p161v0.C3463j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.g3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0889g3 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f4155e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f4156f;

    public /* synthetic */ C0889g3(InterfaceC3279c interfaceC3279c, int i7) {
        this.f4155e = i7;
        this.f4156f = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f4155e) {
            case 0:
                InterfaceC3279c interfaceC3279c = this.f4156f;
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "it");
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i7 = 0; i7 < length; i7++) {
                    char charAt = str.charAt(i7);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                interfaceC3279c.mo23f(AbstractC0444k.m955s0(sb.toString(), 6));
                break;
            case 1:
                this.f4156f.mo23f(String.valueOf(AbstractC3784a.m5794D(((Float) obj).floatValue())));
                break;
            case 2:
                InterfaceC3279c interfaceC3279c2 = this.f4156f;
                float floatValue = ((Float) obj).floatValue();
                List list = AbstractC1220qo.f7143a;
                interfaceC3279c2.mo23f(AbstractC1220qo.m2157b(AbstractC3784a.m5794D(floatValue)));
                break;
            default:
                AbstractC3459f abstractC3459f = (AbstractC3459f) this.f4156f.mo23f((C3463j) obj);
                synchronized (AbstractC3465l.f16721c) {
                    AbstractC3465l.f16722d = AbstractC3465l.f16722d.m5233e(abstractC3459f.mo5221g());
                }
                return abstractC3459f;
        }
        return C1694m.f10482a;
    }
}
