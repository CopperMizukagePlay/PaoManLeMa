package p039e5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.widget.Toast;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.nj */
/* loaded from: classes.dex */
public final class C1122nj extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: A */
    public final /* synthetic */ InterfaceC2425y0 f6264A;

    /* renamed from: B */
    public final /* synthetic */ InterfaceC2425y0 f6265B;

    /* renamed from: C */
    public final /* synthetic */ InterfaceC2425y0 f6266C;

    /* renamed from: D */
    public final /* synthetic */ InterfaceC2425y0 f6267D;

    /* renamed from: E */
    public final /* synthetic */ InterfaceC2425y0 f6268E;

    /* renamed from: F */
    public final /* synthetic */ InterfaceC2425y0 f6269F;

    /* renamed from: G */
    public final /* synthetic */ InterfaceC2425y0 f6270G;

    /* renamed from: H */
    public final /* synthetic */ C3469p f6271H;

    /* renamed from: I */
    public final /* synthetic */ InterfaceC2425y0 f6272I;

    /* renamed from: J */
    public final /* synthetic */ C3469p f6273J;

    /* renamed from: K */
    public final /* synthetic */ InterfaceC2425y0 f6274K;

    /* renamed from: L */
    public final /* synthetic */ InterfaceC2425y0 f6275L;

    /* renamed from: M */
    public final /* synthetic */ InterfaceC2425y0 f6276M;

    /* renamed from: N */
    public final /* synthetic */ InterfaceC2425y0 f6277N;

    /* renamed from: O */
    public final /* synthetic */ InterfaceC2425y0 f6278O;

    /* renamed from: P */
    public final /* synthetic */ InterfaceC2425y0 f6279P;

    /* renamed from: Q */
    public final /* synthetic */ InterfaceC2425y0 f6280Q;

    /* renamed from: R */
    public final /* synthetic */ InterfaceC2425y0 f6281R;

    /* renamed from: S */
    public final /* synthetic */ InterfaceC2425y0 f6282S;

    /* renamed from: T */
    public final /* synthetic */ InterfaceC2425y0 f6283T;

    /* renamed from: U */
    public final /* synthetic */ InterfaceC2425y0 f6284U;

    /* renamed from: V */
    public final /* synthetic */ InterfaceC2425y0 f6285V;

    /* renamed from: W */
    public final /* synthetic */ InterfaceC2425y0 f6286W;

    /* renamed from: X */
    public final /* synthetic */ InterfaceC2425y0 f6287X;

    /* renamed from: Y */
    public final /* synthetic */ InterfaceC2425y0 f6288Y;

    /* renamed from: Z */
    public final /* synthetic */ InterfaceC2425y0 f6289Z;

    /* renamed from: a0 */
    public final /* synthetic */ InterfaceC2425y0 f6290a0;

    /* renamed from: b0 */
    public final /* synthetic */ InterfaceC2425y0 f6291b0;

    /* renamed from: c0 */
    public final /* synthetic */ InterfaceC2425y0 f6292c0;

    /* renamed from: d0 */
    public final /* synthetic */ InterfaceC2425y0 f6293d0;

    /* renamed from: e0 */
    public final /* synthetic */ InterfaceC2425y0 f6294e0;

    /* renamed from: f0 */
    public final /* synthetic */ InterfaceC2425y0 f6295f0;

    /* renamed from: g0 */
    public final /* synthetic */ InterfaceC2425y0 f6296g0;

    /* renamed from: h0 */
    public final /* synthetic */ InterfaceC2425y0 f6297h0;

    /* renamed from: i */
    public int f6298i;

    /* renamed from: i0 */
    public final /* synthetic */ InterfaceC2425y0 f6299i0;

    /* renamed from: j */
    public final /* synthetic */ Context f6300j;

    /* renamed from: j0 */
    public final /* synthetic */ InterfaceC2425y0 f6301j0;

    /* renamed from: k */
    public final /* synthetic */ C0813dm f6302k;

    /* renamed from: k0 */
    public final /* synthetic */ InterfaceC2425y0 f6303k0;

    /* renamed from: l */
    public final /* synthetic */ C0976ir f6304l;

    /* renamed from: l0 */
    public final /* synthetic */ InterfaceC2425y0 f6305l0;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2425y0 f6306m;

    /* renamed from: m0 */
    public final /* synthetic */ C2349d1 f6307m0;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f6308n;

    /* renamed from: n0 */
    public final /* synthetic */ InterfaceC2425y0 f6309n0;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC0516a0 f6310o;

    /* renamed from: o0 */
    public final /* synthetic */ InterfaceC2425y0 f6311o0;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC2425y0 f6312p;

    /* renamed from: p0 */
    public final /* synthetic */ InterfaceC2425y0 f6313p0;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC2425y0 f6314q;

    /* renamed from: q0 */
    public final /* synthetic */ InterfaceC2425y0 f6315q0;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC2425y0 f6316r;

    /* renamed from: r0 */
    public final /* synthetic */ InterfaceC2425y0 f6317r0;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC2425y0 f6318s;

    /* renamed from: s0 */
    public final /* synthetic */ InterfaceC2425y0 f6319s0;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC2425y0 f6320t;

    /* renamed from: t0 */
    public final /* synthetic */ InterfaceC2425y0 f6321t0;

    /* renamed from: u */
    public final /* synthetic */ InterfaceC2425y0 f6322u;

    /* renamed from: u0 */
    public final /* synthetic */ InterfaceC2425y0 f6323u0;

    /* renamed from: v */
    public final /* synthetic */ InterfaceC2425y0 f6324v;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC2425y0 f6325w;

    /* renamed from: x */
    public final /* synthetic */ C1100ms f6326x;

    /* renamed from: y */
    public final /* synthetic */ C1340uk f6327y;

    /* renamed from: z */
    public final /* synthetic */ InterfaceC2425y0 f6328z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122nj(Context context, C0813dm c0813dm, C0976ir c0976ir, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, InterfaceC2425y0 interfaceC2425y07, InterfaceC2425y0 interfaceC2425y08, InterfaceC2425y0 interfaceC2425y09, InterfaceC2425y0 interfaceC2425y010, C1100ms c1100ms, C1340uk c1340uk, InterfaceC2425y0 interfaceC2425y011, InterfaceC2425y0 interfaceC2425y012, InterfaceC2425y0 interfaceC2425y013, InterfaceC2425y0 interfaceC2425y014, InterfaceC2425y0 interfaceC2425y015, InterfaceC2425y0 interfaceC2425y016, InterfaceC2425y0 interfaceC2425y017, InterfaceC2425y0 interfaceC2425y018, C3469p c3469p, InterfaceC2425y0 interfaceC2425y019, C3469p c3469p2, InterfaceC2425y0 interfaceC2425y020, InterfaceC2425y0 interfaceC2425y021, InterfaceC2425y0 interfaceC2425y022, InterfaceC2425y0 interfaceC2425y023, InterfaceC2425y0 interfaceC2425y024, InterfaceC2425y0 interfaceC2425y025, InterfaceC2425y0 interfaceC2425y026, InterfaceC2425y0 interfaceC2425y027, InterfaceC2425y0 interfaceC2425y028, InterfaceC2425y0 interfaceC2425y029, InterfaceC2425y0 interfaceC2425y030, InterfaceC2425y0 interfaceC2425y031, InterfaceC2425y0 interfaceC2425y032, InterfaceC2425y0 interfaceC2425y033, InterfaceC2425y0 interfaceC2425y034, InterfaceC2425y0 interfaceC2425y035, InterfaceC2425y0 interfaceC2425y036, InterfaceC2425y0 interfaceC2425y037, InterfaceC2425y0 interfaceC2425y038, InterfaceC2425y0 interfaceC2425y039, InterfaceC2425y0 interfaceC2425y040, InterfaceC2425y0 interfaceC2425y041, InterfaceC2425y0 interfaceC2425y042, InterfaceC2425y0 interfaceC2425y043, InterfaceC2425y0 interfaceC2425y044, InterfaceC2425y0 interfaceC2425y045, InterfaceC2425y0 interfaceC2425y046, InterfaceC2425y0 interfaceC2425y047, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y048, InterfaceC2425y0 interfaceC2425y049, InterfaceC2425y0 interfaceC2425y050, InterfaceC2425y0 interfaceC2425y051, InterfaceC2425y0 interfaceC2425y052, InterfaceC2425y0 interfaceC2425y053, InterfaceC2425y0 interfaceC2425y054, InterfaceC2425y0 interfaceC2425y055, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f6300j = context;
        this.f6302k = c0813dm;
        this.f6304l = c0976ir;
        this.f6306m = interfaceC2425y0;
        this.f6308n = interfaceC2425y02;
        this.f6310o = interfaceC0516a0;
        this.f6312p = interfaceC2425y03;
        this.f6314q = interfaceC2425y04;
        this.f6316r = interfaceC2425y05;
        this.f6318s = interfaceC2425y06;
        this.f6320t = interfaceC2425y07;
        this.f6322u = interfaceC2425y08;
        this.f6324v = interfaceC2425y09;
        this.f6325w = interfaceC2425y010;
        this.f6326x = c1100ms;
        this.f6327y = c1340uk;
        this.f6328z = interfaceC2425y011;
        this.f6264A = interfaceC2425y012;
        this.f6265B = interfaceC2425y013;
        this.f6266C = interfaceC2425y014;
        this.f6267D = interfaceC2425y015;
        this.f6268E = interfaceC2425y016;
        this.f6269F = interfaceC2425y017;
        this.f6270G = interfaceC2425y018;
        this.f6271H = c3469p;
        this.f6272I = interfaceC2425y019;
        this.f6273J = c3469p2;
        this.f6274K = interfaceC2425y020;
        this.f6275L = interfaceC2425y021;
        this.f6276M = interfaceC2425y022;
        this.f6277N = interfaceC2425y023;
        this.f6278O = interfaceC2425y024;
        this.f6279P = interfaceC2425y025;
        this.f6280Q = interfaceC2425y026;
        this.f6281R = interfaceC2425y027;
        this.f6282S = interfaceC2425y028;
        this.f6283T = interfaceC2425y029;
        this.f6284U = interfaceC2425y030;
        this.f6285V = interfaceC2425y031;
        this.f6286W = interfaceC2425y032;
        this.f6287X = interfaceC2425y033;
        this.f6288Y = interfaceC2425y034;
        this.f6289Z = interfaceC2425y035;
        this.f6290a0 = interfaceC2425y036;
        this.f6291b0 = interfaceC2425y037;
        this.f6292c0 = interfaceC2425y038;
        this.f6293d0 = interfaceC2425y039;
        this.f6294e0 = interfaceC2425y040;
        this.f6295f0 = interfaceC2425y041;
        this.f6296g0 = interfaceC2425y042;
        this.f6297h0 = interfaceC2425y043;
        this.f6299i0 = interfaceC2425y044;
        this.f6301j0 = interfaceC2425y045;
        this.f6303k0 = interfaceC2425y046;
        this.f6305l0 = interfaceC2425y047;
        this.f6307m0 = c2349d1;
        this.f6309n0 = interfaceC2425y048;
        this.f6311o0 = interfaceC2425y049;
        this.f6313p0 = interfaceC2425y050;
        this.f6315q0 = interfaceC2425y051;
        this.f6317r0 = interfaceC2425y052;
        this.f6319s0 = interfaceC2425y053;
        this.f6321t0 = interfaceC2425y054;
        this.f6323u0 = interfaceC2425y055;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1122nj) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1122nj(this.f6300j, this.f6302k, this.f6304l, this.f6306m, this.f6308n, this.f6310o, this.f6312p, this.f6314q, this.f6316r, this.f6318s, this.f6320t, this.f6322u, this.f6324v, this.f6325w, this.f6326x, this.f6327y, this.f6328z, this.f6264A, this.f6265B, this.f6266C, this.f6267D, this.f6268E, this.f6269F, this.f6270G, this.f6271H, this.f6272I, this.f6273J, this.f6274K, this.f6275L, this.f6276M, this.f6277N, this.f6278O, this.f6279P, this.f6280Q, this.f6281R, this.f6282S, this.f6283T, this.f6284U, this.f6285V, this.f6286W, this.f6287X, this.f6288Y, this.f6289Z, this.f6290a0, this.f6291b0, this.f6292c0, this.f6293d0, this.f6294e0, this.f6295f0, this.f6296g0, this.f6297h0, this.f6299i0, this.f6301j0, this.f6303k0, this.f6305l0, this.f6307m0, this.f6309n0, this.f6311o0, this.f6313p0, this.f6315q0, this.f6317r0, this.f6319s0, this.f6321t0, this.f6323u0, interfaceC2313c);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        ConnectivityManager connectivityManager;
        int i7 = this.f6298i;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            this.f6298i = 1;
            Object m1131i = AbstractC0525d0.m1131i(350L, this);
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (m1131i == enumC2465a) {
                return enumC2465a;
            }
        }
        Context context = this.f6300j;
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        C1694m c1694m = C1694m.f10482a;
        if (connectivityManager != null) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            AbstractC3367j.m5099d(allNetworks, "getAllNetworks(...)");
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    Toast.makeText(context, "VPN 仍在运行，请手动关闭后重试", 1).show();
                    return c1694m;
                }
            }
        }
        C0813dm c0813dm = this.f6302k;
        AbstractC1092mk.m1738U0(this.f6304l, this.f6306m, context, this.f6308n, this.f6310o, this.f6312p, this.f6314q, this.f6316r, this.f6318s, this.f6320t, this.f6322u, this.f6324v, this.f6325w, this.f6326x, this.f6327y, this.f6328z, this.f6264A, this.f6265B, this.f6266C, this.f6267D, this.f6268E, this.f6269F, this.f6270G, this.f6271H, this.f6272I, this.f6273J, this.f6274K, this.f6275L, this.f6276M, this.f6277N, this.f6278O, this.f6279P, this.f6280Q, this.f6281R, this.f6282S, this.f6283T, this.f6284U, this.f6285V, this.f6286W, this.f6287X, this.f6288Y, this.f6289Z, this.f6290a0, this.f6291b0, this.f6292c0, this.f6293d0, this.f6294e0, this.f6295f0, this.f6296g0, this.f6297h0, this.f6299i0, this.f6301j0, this.f6303k0, this.f6305l0, this.f6307m0, this.f6309n0, this.f6311o0, this.f6313p0, this.f6315q0, this.f6317r0, this.f6319s0, this.f6321t0, this.f6323u0, c0813dm.f3517a, c0813dm.f3518b, c0813dm.f3519c, c0813dm.f3520d, c0813dm.f3521e, c0813dm.f3522f);
        return c1694m;
    }
}
