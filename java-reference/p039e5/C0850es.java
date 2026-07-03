package p039e5;

import android.net.Network;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.es */
/* loaded from: classes.dex */
public final class C0850es extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f3839i = 0;

    /* renamed from: j */
    public int f3840j;

    /* renamed from: k */
    public /* synthetic */ Object f3841k;

    /* renamed from: l */
    public final /* synthetic */ Object f3842l;

    /* renamed from: m */
    public final /* synthetic */ int f3843m;

    /* renamed from: n */
    public final /* synthetic */ int f3844n;

    /* renamed from: o */
    public final /* synthetic */ Object f3845o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0850es(int i7, int i8, C1100ms c1100ms, C1248rl c1248rl, List list, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f3843m = i7;
        this.f3844n = i8;
        this.f3841k = c1100ms;
        this.f3842l = c1248rl;
        this.f3845o = list;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f3839i) {
            case 0:
                return ((C0850es) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0850es) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0850es) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f3839i) {
            case 0:
                return new C0850es(this.f3843m, this.f3844n, (C1100ms) this.f3841k, (C1248rl) this.f3842l, (List) this.f3845o, interfaceC2313c);
            case 1:
                return new C0850es((C1100ms) this.f3841k, (C1248rl) this.f3842l, this.f3843m, this.f3844n, (List) this.f3845o, interfaceC2313c);
            default:
                C0850es c0850es = new C0850es((String) this.f3842l, (Network) this.f3845o, this.f3840j, this.f3843m, this.f3844n, interfaceC2313c);
                c0850es.f3841k = obj;
                return c0850es;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i(r10, r12) == r9) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fc, code lost:
    
        if (p039e5.C1100ms.m1916i(r2, r3, r13, r7, r12) == r9) goto L60;
     */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Object m2985m;
        Socket socket;
        switch (this.f3839i) {
            case 0:
                List list = (List) this.f3845o;
                C1248rl c1248rl = (C1248rl) this.f3842l;
                String str = c1248rl.f7390a;
                C1100ms c1100ms = (C1100ms) this.f3841k;
                int i7 = this.f3840j;
                int i8 = this.f3843m;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i7 != 0) {
                    if (i7 != 1 && i7 != 2) {
                        if (i7 == 3) {
                            AbstractC1793a0.m2972L(obj);
                            return C1694m.f10482a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (i8 >= this.f3844n) {
                        long m1909d = C1100ms.m1909d(c1100ms, str, i8);
                        this.f3840j = 1;
                        if (AbstractC0525d0.m1131i(m1909d, this) == enumC2465a) {
                            return enumC2465a;
                        }
                    } else {
                        String str2 = (String) list.get(i8 % list.size());
                        this.f3840j = 2;
                        if (C1100ms.m1916i(c1100ms, str, str2, i8, this) == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                }
                this.f3840j = 3;
                if (C1100ms.m1905b(c1100ms, c1248rl, list, i8, this) == enumC2465a) {
                    return enumC2465a;
                }
                return C1694m.f10482a;
            case 1:
                List list2 = (List) this.f3845o;
                C1248rl c1248rl2 = (C1248rl) this.f3842l;
                C1100ms c1100ms2 = (C1100ms) this.f3841k;
                int i9 = this.f3840j;
                int i10 = this.f3843m;
                C1694m c1694m = C1694m.f10482a;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                if (i9 != 0) {
                    if (i9 != 1 && i9 != 2) {
                        if (i9 == 3) {
                            AbstractC1793a0.m2972L(obj);
                            return c1694m;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    String str3 = c1248rl2.f7390a;
                    String str4 = c1248rl2.f7390a;
                    if (!c1100ms2.f6120y.contains(str3)) {
                        if (i10 >= this.f3844n) {
                            long m1909d2 = C1100ms.m1909d(c1100ms2, str4, i10);
                            this.f3840j = 1;
                            break;
                        } else {
                            String str5 = (String) list2.get(i10 % list2.size());
                            this.f3840j = 2;
                            break;
                        }
                    } else {
                        return c1694m;
                    }
                }
                if (!c1100ms2.f6120y.contains(c1248rl2.f7390a)) {
                    this.f3840j = 3;
                    if (C1100ms.m1905b(c1100ms2, c1248rl2, list2, i10, this) != enumC2465a2) {
                        return c1694m;
                    }
                    return enumC2465a2;
                }
                return c1694m;
            default:
                AbstractC1793a0.m2972L(obj);
                String str6 = (String) this.f3842l;
                Network network = (Network) this.f3845o;
                int i11 = this.f3840j;
                int i12 = this.f3843m;
                int i13 = this.f3844n;
                try {
                    InetAddress byName = InetAddress.getByName(str6);
                    long nanoTime = System.nanoTime();
                    if (network != null) {
                        socket = new Socket();
                    } else {
                        socket = new Socket();
                    }
                    Socket socket2 = socket;
                    if (network != null) {
                        try {
                            network.bindSocket(socket2);
                        } finally {
                        }
                    }
                    socket2.connect(new InetSocketAddress(byName, i11), i12);
                    double nanoTime2 = (System.nanoTime() - nanoTime) / 1000000.0d;
                    m2985m = new C1094mm(i13, true, nanoTime2, String.format(Locale.US, "%.0f ms", Arrays.copyOf(new Object[]{new Double(nanoTime2)}, 1)));
                    try {
                        socket2.close();
                    } catch (Throwable th) {
                        AbstractC1793a0.m2985m(th);
                    }
                } catch (Throwable th2) {
                    m2985m = AbstractC1793a0.m2985m(th2);
                }
                if (C1690i.m2747a(m2985m) != null) {
                    return new C1094mm(this.f3844n, false, 0.0d, "连接失败");
                }
                return m2985m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0850es(C1100ms c1100ms, C1248rl c1248rl, int i7, int i8, List list, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f3841k = c1100ms;
        this.f3842l = c1248rl;
        this.f3843m = i7;
        this.f3844n = i8;
        this.f3845o = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0850es(String str, Network network, int i7, int i8, int i9, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f3842l = str;
        this.f3845o = network;
        this.f3840j = i7;
        this.f3843m = i8;
        this.f3844n = i9;
    }
}
