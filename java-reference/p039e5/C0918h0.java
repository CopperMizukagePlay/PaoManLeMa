package p039e5;

import java.io.File;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.Map;
import p066i3.AbstractC2067b;
import p144t.AbstractC3122c;
import p152u.C3326n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.h0 */
/* loaded from: classes.dex */
public final class C0918h0 implements Comparator {

    /* renamed from: e */
    public final /* synthetic */ int f4390e;

    public /* synthetic */ C0918h0(int i7) {
        this.f4390e = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        switch (this.f4390e) {
            case 0:
                C1102n c1102n = (C1102n) obj;
                long j6 = 1;
                long j7 = (c1102n.f6129c.get() - c1102n.f6128b.get()) + 1;
                if (j7 < 1) {
                    j7 = 1;
                }
                Double valueOf = Double.valueOf((c1102n.f6130d.get() - r2.get()) / j7);
                C1102n c1102n2 = (C1102n) obj2;
                long j8 = (c1102n2.f6129c.get() - c1102n2.f6128b.get()) + 1;
                if (j8 >= 1) {
                    j6 = j8;
                }
                return AbstractC2067b.m3284i(valueOf, Double.valueOf((c1102n2.f6130d.get() - r1.get()) / j6));
            case 1:
                return AbstractC2067b.m3284i(((EnumC0768c9) ((Map.Entry) obj).getKey()).name(), ((EnumC0768c9) ((Map.Entry) obj2).getKey()).name());
            case 2:
                return AbstractC2067b.m3284i(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
            case 3:
                return AbstractC2067b.m3284i(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
            case 4:
                return AbstractC2067b.m3284i(Integer.valueOf(((C0831e9) obj).f3659a), Integer.valueOf(((C0831e9) obj2).f3659a));
            case AbstractC3122c.f15761f /* 5 */:
                return AbstractC2067b.m3284i(Integer.valueOf(((C3326n) obj).f16341m), Integer.valueOf(((C3326n) obj2).f16341m));
            case AbstractC3122c.f15759d /* 6 */:
                return AbstractC2067b.m3284i(((C1248rl) obj).f7391b, ((C1248rl) obj2).f7391b);
            case 7:
                Double valueOf2 = Double.valueOf(Double.MAX_VALUE);
                Double d7 = ((C1467yn) obj).f9466c;
                if (d7 == null) {
                    d7 = valueOf2;
                }
                Double d8 = ((C1467yn) obj2).f9466c;
                if (d8 != null) {
                    valueOf2 = d8;
                }
                return AbstractC2067b.m3284i(d7, valueOf2);
            case 8:
                Double valueOf3 = Double.valueOf(Double.MAX_VALUE);
                Double d9 = ((C1467yn) obj).f9466c;
                if (d9 == null) {
                    d9 = valueOf3;
                }
                Double d10 = ((C1467yn) obj2).f9466c;
                if (d10 != null) {
                    valueOf3 = d10;
                }
                return AbstractC2067b.m3284i(d9, valueOf3);
            case AbstractC3122c.f15758c /* 9 */:
                return AbstractC2067b.m3284i(((C0707ac) obj).f2362b, ((C0707ac) obj2).f2362b);
            case AbstractC3122c.f15760e /* 10 */:
                int i8 = 1;
                if (((InetAddress) obj).getAddress().length == 4) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                Integer valueOf4 = Integer.valueOf(i7);
                if (((InetAddress) obj2).getAddress().length == 4) {
                    i8 = 0;
                }
                return AbstractC2067b.m3284i(valueOf4, Integer.valueOf(i8));
            default:
                return AbstractC2067b.m3284i(Integer.valueOf(((C1132nt) obj).f6404a), Integer.valueOf(((C1132nt) obj2).f6404a));
        }
    }
}
