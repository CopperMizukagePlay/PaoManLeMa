package p039e5;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.paoman.lema.OverlayKeepAliveService;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ii */
/* loaded from: classes.dex */
public final class C0967ii extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ boolean f4901i;

    /* renamed from: j */
    public final /* synthetic */ Context f4902j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f4903k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0967ii(boolean z7, Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f4901i = z7;
        this.f4902j = context;
        this.f4903k = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C0967ii c0967ii = (C0967ii) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
        C1694m c1694m = C1694m.f10482a;
        c0967ii.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C0967ii(this.f4901i, this.f4902j, this.f4903k, interfaceC2313c);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        AbstractC1793a0.m2972L(obj);
        float f7 = AbstractC1092mk.f5952h;
        boolean booleanValue = ((Boolean) this.f4903k.getValue()).booleanValue();
        Context context = this.f4902j;
        if (booleanValue && this.f4901i && AbstractC1092mk.m1815k3(context)) {
            if (AbstractC1092mk.m1815k3(context)) {
                Intent intent = new Intent(context, (Class<?>) OverlayKeepAliveService.class);
                intent.setAction("com.paoman.lema.overlay_keepalive.START");
                if (Build.VERSION.SDK_INT >= 26) {
                    context.startForegroundService(intent);
                } else {
                    context.startService(intent);
                }
            }
        } else {
            Intent intent2 = new Intent(context, (Class<?>) OverlayKeepAliveService.class);
            intent2.setAction("com.paoman.lema.overlay_keepalive.STOP");
            context.startService(intent2);
        }
        return C1694m.f10482a;
    }
}
