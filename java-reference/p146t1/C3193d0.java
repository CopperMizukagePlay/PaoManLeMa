package p146t1;

import java.util.Map;
import p077k.C2194h0;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.d0 */
/* loaded from: classes.dex */
public final class C3193d0 implements InterfaceC3220m0 {

    /* renamed from: a */
    public final /* synthetic */ int f15935a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC3220m0 f15936b;

    /* renamed from: c */
    public final /* synthetic */ C3205h0 f15937c;

    /* renamed from: d */
    public final /* synthetic */ int f15938d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC3220m0 f15939e;

    public /* synthetic */ C3193d0(InterfaceC3220m0 interfaceC3220m0, C3205h0 c3205h0, int i7, InterfaceC3220m0 interfaceC3220m02, int i8) {
        this.f15935a = i8;
        this.f15937c = c3205h0;
        this.f15938d = i7;
        this.f15939e = interfaceC3220m02;
        this.f15936b = interfaceC3220m0;
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: a */
    public final Map mo4882a() {
        switch (this.f15935a) {
            case 0:
                return this.f15936b.mo4882a();
            default:
                return this.f15936b.mo4882a();
        }
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: b */
    public final void mo4883b() {
        switch (this.f15935a) {
            case 0:
                int i7 = this.f15938d;
                C3205h0 c3205h0 = this.f15937c;
                c3205h0.f15962i = i7;
                this.f15939e.mo4883b();
                C2194h0 c2194h0 = c3205h0.f15969p;
                long[] jArr = c2194h0.f12676a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j6 = jArr[i8];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j6) < 128) {
                                    int i11 = (i8 << 3) + i10;
                                    Object obj = c2194h0.f12677b[i11];
                                    InterfaceC3194d1 interfaceC3194d1 = (InterfaceC3194d1) c2194h0.f12678c[i11];
                                    int m4307i = c3205h0.f15970q.m4307i(obj);
                                    if (m4307i < 0 || m4307i >= c3205h0.f15962i) {
                                        interfaceC3194d1.mo4901a();
                                        c2194h0.m3597l(i11);
                                    }
                                }
                                j6 >>= 8;
                            }
                            if (i9 != 8) {
                                return;
                            }
                        }
                        if (i8 != length) {
                            i8++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            default:
                int i12 = this.f15938d;
                C3205h0 c3205h02 = this.f15937c;
                c3205h02.f15961h = i12;
                this.f15939e.mo4883b();
                c3205h02.m4906c(c3205h02.f15961h);
                return;
        }
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: c */
    public final int mo4884c() {
        switch (this.f15935a) {
            case 0:
                return this.f15936b.mo4884c();
            default:
                return this.f15936b.mo4884c();
        }
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: d */
    public final InterfaceC3279c mo4885d() {
        switch (this.f15935a) {
            case 0:
                return this.f15936b.mo4885d();
            default:
                return this.f15936b.mo4885d();
        }
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: e */
    public final int mo4886e() {
        switch (this.f15935a) {
            case 0:
                return this.f15936b.mo4886e();
            default:
                return this.f15936b.mo4886e();
        }
    }
}
