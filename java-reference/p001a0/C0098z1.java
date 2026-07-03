package p001a0;

import android.net.IpPrefix;
import android.net.RouteInfo;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import p019c1.C0377u;
import p019c1.C0379w;
import p032d6.AbstractC0529e1;
import p034e0.C0616l0;
import p034e0.C0634u0;
import p039e5.C0929hb;
import p050g2.C1602n0;
import p053g5.C1694m;
import p087l2.C2432a;
import p087l2.C2459w;
import p102n1.AbstractC2710c;
import p102n1.C2709b;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3367j;
import p158u5.C3374q;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3551w1;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.z1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0098z1 extends AbstractC3365h implements InterfaceC3279c {

    /* renamed from: m */
    public final /* synthetic */ int f466m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0098z1(int i7, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i7, obj, cls, str, str2, i8, i9);
        this.f466m = i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x011e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Type inference failed for: r2v1, types: [u5.q, java.lang.Object] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo23f(Object obj) {
        C2432a c2432a;
        int m27a;
        Integer valueOf;
        InterfaceC3551w1 interfaceC3551w1;
        boolean z7;
        InetAddress address;
        boolean z8;
        InetAddress address2;
        switch (this.f466m) {
            case 0:
                KeyEvent keyEvent = ((C2709b) obj).f14537a;
                C0095y1 c0095y1 = (C0095y1) this.f16432f;
                C0634u0 c0634u0 = c0095y1.f438f;
                boolean z9 = c0095y1.f436d;
                boolean z10 = true;
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    C0082u0 c0082u0 = c0095y1.f441i;
                    c0082u0.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        c0082u0.f393a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        valueOf = null;
                    } else {
                        Integer num = c0082u0.f393a;
                        if (num != null) {
                            c0082u0.f393a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            valueOf = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                valueOf = null;
                            }
                            if (valueOf == null) {
                                valueOf = Integer.valueOf(unicodeChar);
                            }
                        } else {
                            valueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (valueOf != null) {
                        c2432a = new C2432a(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        if (c2432a == null) {
                            if (z9) {
                                c0095y1.m197a(AbstractC3784a.m5817z(c2432a));
                                c0634u0.f2098a = null;
                            }
                            z10 = false;
                        } else {
                            if (AbstractC2710c.m4320C(keyEvent) == 2 && (m27a = c0095y1.f442j.m27a(keyEvent)) != 0) {
                                boolean z11 = true;
                                switch (m27a) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case AbstractC3122c.f15761f /* 5 */:
                                    case AbstractC3122c.f15759d /* 6 */:
                                    case 7:
                                    case 8:
                                    case AbstractC3122c.f15758c /* 9 */:
                                    case AbstractC3122c.f15760e /* 10 */:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case AbstractC3122c.f15762g /* 15 */:
                                    case 16:
                                    case 17:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                        z11 = false;
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                        if (!z11 || z9) {
                                            ?? obj2 = new Object();
                                            obj2.f16446e = true;
                                            C0092x1 c0092x1 = new C0092x1(m27a, c0095y1, (C3374q) obj2);
                                            C2459w c2459w = c0095y1.f435c;
                                            C0616l0 c0616l0 = new C0616l0(c2459w, c0095y1.f439g, c0095y1.f433a.m120d(), c0634u0);
                                            c0092x1.mo23f(c0616l0);
                                            if (!C1602n0.m2585a(c0616l0.f2028f, c2459w.f13724b) || !AbstractC3367j.m5096a(c0616l0.f2029g, c2459w.f13723a)) {
                                                c0095y1.f443k.mo23f(C2459w.m4026a(c2459w, c0616l0.f2029g, c0616l0.f2028f, 4));
                                            }
                                            C0072r2 c0072r2 = c0095y1.f440h;
                                            if (c0072r2 != null) {
                                                c0072r2.f360e = true;
                                            }
                                            z10 = obj2.f16446e;
                                            break;
                                        }
                                        break;
                                    default:
                                        throw null;
                                }
                            }
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                }
                c2432a = null;
                if (c2432a == null) {
                }
                return Boolean.valueOf(z10);
            case 1:
                ((C0379w) this.f16432f).getClass();
                Object obj3 = ((C0377u) obj).f17992e;
                if (obj3 instanceof InterfaceC3551w1) {
                    interfaceC3551w1 = (InterfaceC3551w1) obj3;
                } else {
                    interfaceC3551w1 = null;
                }
                if (interfaceC3551w1 != null) {
                    AbstractC3498f.m5375o(interfaceC3551w1);
                }
                return C1694m.f10482a;
            case 2:
                ((AbstractC0529e1) this.f16432f).mo1112l((Throwable) obj);
                return C1694m.f10482a;
            case 3:
                RouteInfo routeInfo = (RouteInfo) obj;
                AbstractC3367j.m5100e(routeInfo, "p0");
                ((C0929hb) this.f16432f).getClass();
                IpPrefix destination = routeInfo.getDestination();
                if (destination != null && (address = destination.getAddress()) != null && (address instanceof Inet4Address) && destination.getPrefixLength() == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            default:
                RouteInfo routeInfo2 = (RouteInfo) obj;
                AbstractC3367j.m5100e(routeInfo2, "p0");
                ((C0929hb) this.f16432f).getClass();
                IpPrefix destination2 = routeInfo2.getDestination();
                if (destination2 != null && (address2 = destination2.getAddress()) != null && (address2 instanceof Inet6Address) && destination2.getPrefixLength() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
        }
    }
}
