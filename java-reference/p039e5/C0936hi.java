package p039e5;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.paoman.lema.KeepAliveService;
import p032d6.InterfaceC0516a0;
import p051g3.AbstractC1655r;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.hi */
/* loaded from: classes.dex */
public final class C0936hi extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ boolean f4577i;

    /* renamed from: j */
    public final /* synthetic */ Context f4578j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f4579k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2425y0 f4580l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0936hi(boolean z7, Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f4577i = z7;
        this.f4578j = context;
        this.f4579k = interfaceC2425y0;
        this.f4580l = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C0936hi c0936hi = (C0936hi) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
        C1694m c1694m = C1694m.f10482a;
        c0936hi.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C0936hi(this.f4577i, this.f4578j, this.f4579k, this.f4580l, interfaceC2313c);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        boolean z7;
        AbstractC1793a0.m2972L(obj);
        boolean z8 = this.f4577i;
        InterfaceC2425y0 interfaceC2425y0 = this.f4579k;
        Context context = this.f4578j;
        if (z8) {
            Intent intent = new Intent(context, (Class<?>) KeepAliveService.class);
            intent.setAction("com.paoman.lema.keepalive.START");
            float f7 = AbstractC1092mk.f5952h;
            if (((Boolean) interfaceC2425y0.getValue()).booleanValue() && ((Boolean) this.f4580l.getValue()).booleanValue()) {
                z7 = true;
            } else {
                z7 = false;
            }
            intent.putExtra("silent_audio_keep_alive", z7);
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC1655r.m2704e(context, intent);
            } else {
                context.startService(intent);
            }
        } else {
            C1247rk.f7381h.m2202v();
            float f8 = AbstractC1092mk.f5952h;
            if (!((Boolean) interfaceC2425y0.getValue()).booleanValue()) {
                Intent intent2 = new Intent(context, (Class<?>) KeepAliveService.class);
                intent2.setAction("com.paoman.lema.keepalive.STOP");
                context.startService(intent2);
            }
        }
        return C1694m.f10482a;
    }
}
