package p107o;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import p140s2.C3102l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.b0 */
/* loaded from: classes.dex */
public final class C2726b0 {

    /* renamed from: a */
    public final Context f14601a;

    /* renamed from: b */
    public final int f14602b;

    /* renamed from: c */
    public long f14603c = 0;

    /* renamed from: d */
    public EdgeEffect f14604d;

    /* renamed from: e */
    public EdgeEffect f14605e;

    /* renamed from: f */
    public EdgeEffect f14606f;

    /* renamed from: g */
    public EdgeEffect f14607g;

    /* renamed from: h */
    public EdgeEffect f14608h;

    /* renamed from: i */
    public EdgeEffect f14609i;

    /* renamed from: j */
    public EdgeEffect f14610j;

    /* renamed from: k */
    public EdgeEffect f14611k;

    public C2726b0(Context context, int i7) {
        this.f14601a = context;
        this.f14602b = i7;
    }

    /* renamed from: f */
    public static boolean m4384f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* renamed from: g */
    public static boolean m4385g(EdgeEffect edgeEffect) {
        float f7;
        boolean z7 = false;
        if (edgeEffect == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            f7 = C2743h.f14667a.m4413b(edgeEffect);
        } else {
            f7 = 0.0f;
        }
        if (f7 == 0.0f) {
            z7 = true;
        }
        return !z7;
    }

    /* renamed from: a */
    public final EdgeEffect m4386a() {
        EdgeEffect c2747i0;
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f14601a;
        if (i7 >= 31) {
            c2747i0 = C2743h.f14667a.m4412a(context, null);
        } else {
            c2747i0 = new C2747i0(context);
        }
        c2747i0.setColor(this.f14602b);
        if (!C3102l.m4790a(this.f14603c, 0L)) {
            long j6 = this.f14603c;
            c2747i0.setSize((int) (j6 >> 32), (int) (j6 & 4294967295L));
        }
        return c2747i0;
    }

    /* renamed from: b */
    public final EdgeEffect m4387b() {
        EdgeEffect edgeEffect = this.f14605e;
        if (edgeEffect == null) {
            EdgeEffect m4386a = m4386a();
            this.f14605e = m4386a;
            return m4386a;
        }
        return edgeEffect;
    }

    /* renamed from: c */
    public final EdgeEffect m4388c() {
        EdgeEffect edgeEffect = this.f14606f;
        if (edgeEffect == null) {
            EdgeEffect m4386a = m4386a();
            this.f14606f = m4386a;
            return m4386a;
        }
        return edgeEffect;
    }

    /* renamed from: d */
    public final EdgeEffect m4389d() {
        EdgeEffect edgeEffect = this.f14607g;
        if (edgeEffect == null) {
            EdgeEffect m4386a = m4386a();
            this.f14607g = m4386a;
            return m4386a;
        }
        return edgeEffect;
    }

    /* renamed from: e */
    public final EdgeEffect m4390e() {
        EdgeEffect edgeEffect = this.f14604d;
        if (edgeEffect == null) {
            EdgeEffect m4386a = m4386a();
            this.f14604d = m4386a;
            return m4386a;
        }
        return edgeEffect;
    }
}
