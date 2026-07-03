package p039e5;

import android.content.Context;
import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1690i;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p068i5.C2079c;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.qc */
/* loaded from: classes.dex */
public final class C1208qc extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f7077i;

    /* renamed from: j */
    public final /* synthetic */ Context f7078j;

    /* renamed from: k */
    public final /* synthetic */ EnumC0803dc f7079k;

    /* renamed from: l */
    public final /* synthetic */ EnumC0771cc f7080l;

    /* renamed from: m */
    public final /* synthetic */ C1270sc f7081m;

    /* renamed from: n */
    public final /* synthetic */ String f7082n;

    /* renamed from: o */
    public final /* synthetic */ int f7083o;

    /* renamed from: p */
    public final /* synthetic */ EnumC1332uc f7084p;

    /* renamed from: q */
    public final /* synthetic */ int f7085q;

    /* renamed from: r */
    public final /* synthetic */ int f7086r;

    /* renamed from: s */
    public final /* synthetic */ int f7087s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208qc(Context context, EnumC0803dc enumC0803dc, EnumC0771cc enumC0771cc, C1270sc c1270sc, String str, int i7, EnumC1332uc enumC1332uc, int i8, int i9, int i10, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7078j = context;
        this.f7079k = enumC0803dc;
        this.f7080l = enumC0771cc;
        this.f7081m = c1270sc;
        this.f7082n = str;
        this.f7083o = i7;
        this.f7084p = enumC1332uc;
        this.f7085q = i8;
        this.f7086r = i9;
        this.f7087s = i10;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1208qc) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1208qc(this.f7078j, this.f7079k, this.f7080l, this.f7081m, this.f7082n, this.f7083o, this.f7084p, this.f7085q, this.f7086r, this.f7087s, interfaceC2313c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01e6 A[PHI: r9
      0x01e6: PHI (r9v3 l5.a) = (r9v2 l5.a), (r9v4 l5.a), (r9v5 l5.a) binds: [B:33:0x01e4, B:31:0x017e, B:23:0x00bb] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        EnumC2465a enumC2465a;
        C1270sc c1270sc = this.f7081m;
        C1701c0 c1701c0 = c1270sc.f7559i;
        int i7 = this.f7077i;
        C1694m c1694m = C1694m.f10482a;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                return c1694m;
            }
            AbstractC1793a0.m2972L(obj);
            return c1694m;
        }
        AbstractC1793a0.m2972L(obj);
        Serializable m2299z0 = AbstractC1249rm.m2299z0(this.f7078j);
        Throwable m2747a = C1690i.m2747a(m2299z0);
        if (m2747a == null) {
            File file = (File) m2299z0;
            int[] iArr = AbstractC1177pc.f6853a;
            EnumC0803dc enumC0803dc = this.f7079k;
            int i8 = iArr[enumC0803dc.ordinal()];
            EnumC1332uc enumC1332uc = this.f7084p;
            String str = this.f7082n;
            EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
            if (i8 == 1) {
                int ordinal = this.f7080l.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        int i9 = this.f7086r;
                        int i10 = this.f7087s;
                        int i11 = this.f7083o;
                        EnumC0803dc enumC0803dc2 = EnumC0803dc.f3387h;
                        C2079c m2311a = C1270sc.m2311a(c1270sc, file, str, i11, enumC1332uc, enumC0803dc2, this.f7085q, i9, i10);
                        C1394wc m2374a = C1394wc.m2374a((C1394wc) c1701c0.getValue(), AbstractC2487d.m4058v("正在运行: ", C1270sc.m2314d(c1270sc, m2311a)), null, null, null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0L, 0L, null, null, null, 2097147);
                        c1701c0.getClass();
                        c1701c0.m2752j(null, m2374a);
                        this.f7077i = 1;
                        enumC2465a = enumC2465a2;
                        if (C1270sc.m2326t(c1270sc, m2311a, "测试进行中…", "双向测试进行中…", enumC0803dc2, null, this, 192) == enumC2465a) {
                            return enumC2465a;
                        }
                        return c1694m;
                    }
                    throw new RuntimeException();
                }
                enumC2465a = enumC2465a2;
                Pattern pattern = C1270sc.f7550m;
                int m3530q = AbstractC2168e.m3530q(this.f7083o + 1, 1, 65535);
                C2079c m2311a2 = C1270sc.m2311a(c1270sc, file, str, this.f7083o, enumC1332uc, EnumC0803dc.f3385f, this.f7085q, this.f7086r, this.f7087s);
                C2079c m2311a3 = C1270sc.m2311a(c1270sc, file, str, m3530q, enumC1332uc, EnumC0803dc.f3386g, this.f7085q, this.f7086r, this.f7087s);
                C1394wc c1394wc = (C1394wc) c1701c0.getValue();
                StringBuilder sb = new StringBuilder("双向打流（双端口）：\n");
                sb.append("上传 " + C1270sc.m2314d(c1270sc, m2311a2) + "\n");
                sb.append("下载 " + C1270sc.m2314d(c1270sc, m2311a3));
                C1394wc m2374a2 = C1394wc.m2374a(c1394wc, sb.toString(), null, null, null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0L, 0L, null, null, null, 2097147);
                c1701c0.getClass();
                c1701c0.m2752j(null, m2374a2);
                this.f7077i = 2;
                Object m1130h = AbstractC0525d0.m1130h(new C1053lc(c1270sc, m2311a2, m2311a3, m3530q, this.f7083o, null), this);
                if (m1130h != enumC2465a) {
                    m1130h = c1694m;
                }
                if (m1130h == enumC2465a) {
                }
            } else {
                enumC2465a = enumC2465a2;
                C2079c m2311a4 = C1270sc.m2311a(c1270sc, file, str, this.f7083o, enumC1332uc, enumC0803dc, this.f7085q, this.f7086r, this.f7087s);
                C1394wc m2374a3 = C1394wc.m2374a((C1394wc) c1701c0.getValue(), AbstractC2487d.m4058v("正在运行: ", C1270sc.m2314d(c1270sc, m2311a4)), null, null, null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0L, 0L, null, null, null, 2097147);
                c1701c0.getClass();
                c1701c0.m2752j(null, m2374a3);
                this.f7077i = 3;
                if (C1270sc.m2326t(c1270sc, m2311a4, "测试进行中…", "测试进行中…", enumC0803dc, null, this, 192) == enumC2465a) {
                }
            }
        } else {
            String m4058v = AbstractC2487d.m4058v("无法准备 iperf3：", m2747a.getMessage());
            Pattern pattern2 = C1270sc.f7550m;
            c1270sc.m2328p(m4058v);
            return c1694m;
        }
    }
}
