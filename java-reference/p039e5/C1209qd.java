package p039e5;

import android.content.Context;
import android.widget.FrameLayout;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.util.List;
import p001a0.C0068q2;
import p022c4.EnumC0391a;
import p023c5.C0427s;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p053g5.C1694m;
import p073j2.AbstractC2168e;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.qd */
/* loaded from: classes.dex */
public final /* synthetic */ class C1209qd implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7088e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f7089f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f7090g;

    public /* synthetic */ C1209qd(InterfaceC2425y0 interfaceC2425y0, InterfaceC3279c interfaceC3279c, int i7) {
        this.f7088e = i7;
        this.f7089f = interfaceC2425y0;
        this.f7090g = interfaceC3279c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, java.lang.Object, com.journeyapps.barcodescanner.DecoratedBarcodeView, c5.l] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f7088e;
        int i8 = 0;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f7089f;
        InterfaceC3279c interfaceC3279c = this.f7090g;
        switch (i7) {
            case 0:
                Context context = (Context) obj;
                AbstractC3367j.m5100e(context, "ctx");
                ?? frameLayout = new FrameLayout(context);
                frameLayout.m980a(null);
                BarcodeView barcodeView = frameLayout.getBarcodeView();
                List m5817z = AbstractC3784a.m5817z(EnumC0391a.f1326p);
                C0427s c0427s = new C0427s(0);
                c0427s.f1462g = m5817z;
                barcodeView.setDecoderFactory(c0427s);
                frameLayout.setStatusText("将服务端二维码对准取景框");
                C1240rd c1240rd = new C1240rd(frameLayout, interfaceC3279c);
                BarcodeView barcodeView2 = frameLayout.f1521e;
                C0068q2 c0068q2 = new C0068q2((DecoratedBarcodeView) frameLayout, c1240rd);
                barcodeView2.f1514E = 2;
                barcodeView2.f1515F = c0068q2;
                barcodeView2.m978h();
                frameLayout.f1521e.m897c();
                C3137j0 c3137j0 = AbstractC1302td.f7786a;
                interfaceC2425y0.setValue(frameLayout);
                return frameLayout;
            case 1:
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "raw");
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                while (i8 < length) {
                    char charAt = str.charAt(i8);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                    i8++;
                }
                String m955s0 = AbstractC0444k.m955s0(sb.toString(), 5);
                interfaceC2425y0.setValue(m955s0);
                Long m974P = AbstractC0451r.m974P(m955s0);
                if (m974P != null) {
                    interfaceC3279c.mo23f(AbstractC1220qo.m2157b(AbstractC2168e.m3531r(m974P.longValue(), 16L, 5000L)));
                }
                return c1694m;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    interfaceC2425y0.setValue(Boolean.TRUE);
                } else {
                    interfaceC3279c.mo23f(Boolean.FALSE);
                }
                return c1694m;
            case 3:
                String str2 = (String) obj;
                AbstractC3367j.m5100e(str2, "raw");
                StringBuilder sb2 = new StringBuilder();
                int length2 = str2.length();
                while (i8 < length2) {
                    char charAt2 = str2.charAt(i8);
                    if (Character.isDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                    i8++;
                }
                String m955s02 = AbstractC0444k.m955s0(sb2.toString(), 4);
                interfaceC2425y0.setValue(m955s02);
                Integer m973O = AbstractC0451r.m973O(m955s02);
                if (m973O != null) {
                    interfaceC3279c.mo23f(String.valueOf(AbstractC2168e.m3530q(m973O.intValue(), 10, 2000)));
                }
                return c1694m;
            default:
                List list = (List) obj;
                AbstractC3367j.m5100e(list, "subnets");
                interfaceC3279c.mo23f(list);
                interfaceC2425y0.setValue(Boolean.FALSE);
                return c1694m;
        }
    }

    public /* synthetic */ C1209qd(InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f7088e = i7;
        this.f7090g = interfaceC3279c;
        this.f7089f = interfaceC2425y0;
    }
}
