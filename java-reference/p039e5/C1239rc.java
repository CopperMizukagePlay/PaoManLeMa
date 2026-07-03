package p039e5;

import android.content.Context;
import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;
import p001a0.AbstractC0094y0;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1690i;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rc */
/* loaded from: classes.dex */
public final class C1239rc extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f7310i;

    /* renamed from: j */
    public final /* synthetic */ Context f7311j;

    /* renamed from: k */
    public final /* synthetic */ int f7312k;

    /* renamed from: l */
    public final /* synthetic */ C1270sc f7313l;

    /* renamed from: m */
    public final /* synthetic */ int f7314m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1239rc(Context context, int i7, C1270sc c1270sc, int i8, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7311j = context;
        this.f7312k = i7;
        this.f7313l = c1270sc;
        this.f7314m = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1239rc) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1239rc(this.f7311j, this.f7312k, this.f7313l, this.f7314m, interfaceC2313c);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f7310i;
        C1694m c1694m = C1694m.f10482a;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
                return c1694m;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1793a0.m2972L(obj);
        Serializable m2299z0 = AbstractC1249rm.m2299z0(this.f7311j);
        Throwable m2747a = C1690i.m2747a(m2299z0);
        C1270sc c1270sc = this.f7313l;
        if (m2747a == null) {
            File file = (File) m2299z0;
            Pattern pattern = C1270sc.f7550m;
            int i8 = this.f7312k;
            int m3530q = AbstractC2168e.m3530q(i8 + 1, 1, 65535);
            C1701c0 c1701c0 = c1270sc.f7559i;
            C1394wc m2374a = C1394wc.m2374a((C1394wc) c1701c0.getValue(), AbstractC0094y0.m183j(i8, m3530q, "正在启动 iperf3 服务端（", " 上传 / ", " 下载）…"), null, null, null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0L, 0L, null, null, null, 2097147);
            c1701c0.getClass();
            c1701c0.m2752j(null, m2374a);
            int i9 = this.f7312k;
            String m183j = AbstractC0094y0.m183j(i9, m3530q, "服务端就绪：", " 上传 / ", " 下载，等待客户端连接");
            String m183j2 = AbstractC0094y0.m183j(i8, m3530q, "服务端就绪：", " 上传 / ", " 下载，等待客户端连接");
            this.f7310i = 1;
            Object m1130h = AbstractC0525d0.m1130h(new C1115nc(c1270sc, file, i9, this.f7314m, m3530q, m183j, m183j2, null), this);
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (m1130h == enumC2465a) {
                return enumC2465a;
            }
            return c1694m;
        }
        String m4058v = AbstractC2487d.m4058v("无法准备 iperf3：", m2747a.getMessage());
        Pattern pattern2 = C1270sc.f7550m;
        c1270sc.m2328p(m4058v);
        return c1694m;
    }
}
