package p144t;

import android.view.View;
import com.paoman.lema.R;
import java.util.WeakHashMap;
import p051g3.C1624c;
import p051g3.C1672z0;
import p077k.C2196i0;
import p161v0.AbstractC3465l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.v0 */
/* loaded from: classes.dex */
public final class C3161v0 {

    /* renamed from: u */
    public static final WeakHashMap f15846u = new WeakHashMap();

    /* renamed from: a */
    public final C3117a f15847a = C3120b.m4820b("captionBar", 4);

    /* renamed from: b */
    public final C3117a f15848b;

    /* renamed from: c */
    public final C3117a f15849c;

    /* renamed from: d */
    public final C3117a f15850d;

    /* renamed from: e */
    public final C3117a f15851e;

    /* renamed from: f */
    public final C3117a f15852f;

    /* renamed from: g */
    public final C3117a f15853g;

    /* renamed from: h */
    public final C3117a f15854h;

    /* renamed from: i */
    public final C3117a f15855i;

    /* renamed from: j */
    public final C3157t0 f15856j;

    /* renamed from: k */
    public final C3157t0 f15857k;

    /* renamed from: l */
    public final C3157t0 f15858l;

    /* renamed from: m */
    public final C3157t0 f15859m;

    /* renamed from: n */
    public final C3157t0 f15860n;

    /* renamed from: o */
    public final C3157t0 f15861o;

    /* renamed from: p */
    public final C3157t0 f15862p;

    /* renamed from: q */
    public final C3157t0 f15863q;

    /* renamed from: r */
    public final boolean f15864r;

    /* renamed from: s */
    public int f15865s;

    /* renamed from: t */
    public final RunnableC3168z f15866t;

    public C3161v0(View view) {
        View view2;
        Object obj;
        C3117a m4820b = C3120b.m4820b("displayCutout", 128);
        this.f15848b = m4820b;
        C3117a m4820b2 = C3120b.m4820b("ime", 8);
        this.f15849c = m4820b2;
        C3117a m4820b3 = C3120b.m4820b("mandatorySystemGestures", 32);
        this.f15850d = m4820b3;
        this.f15851e = C3120b.m4820b("navigationBars", 2);
        this.f15852f = C3120b.m4820b("statusBars", 1);
        C3117a m4820b4 = C3120b.m4820b("systemBars", 519);
        this.f15853g = m4820b4;
        C3117a m4820b5 = C3120b.m4820b("systemGestures", 16);
        this.f15854h = m4820b5;
        C3117a m4820b6 = C3120b.m4820b("tappableElement", 64);
        this.f15855i = m4820b6;
        C3157t0 c3157t0 = new C3157t0(new C3123c0(0, 0, 0, 0), "waterfall");
        this.f15856j = c3157t0;
        new C3153r0(new C3153r0(m4820b4, m4820b2), m4820b);
        new C3153r0(new C3153r0(new C3153r0(m4820b6, m4820b3), m4820b5), c3157t0);
        this.f15857k = C3120b.m4821d("captionBarIgnoringVisibility", 4);
        this.f15858l = C3120b.m4821d("navigationBarsIgnoringVisibility", 2);
        this.f15859m = C3120b.m4821d("statusBarsIgnoringVisibility", 1);
        this.f15860n = C3120b.m4821d("systemBarsIgnoringVisibility", 519);
        this.f15861o = C3120b.m4821d("tappableElementIgnoringVisibility", 64);
        this.f15862p = C3120b.m4821d("imeAnimationTarget", 8);
        this.f15863q = C3120b.m4821d("imeAnimationSource", 8);
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        this.f15864r = bool != null ? bool.booleanValue() : true;
        this.f15866t = new RunnableC3168z(this);
    }

    /* renamed from: a */
    public static void m4863a(C3161v0 c3161v0, C1672z0 c1672z0) {
        boolean z7 = false;
        c3161v0.f15847a.m4818f(c1672z0, 0);
        c3161v0.f15849c.m4818f(c1672z0, 0);
        c3161v0.f15848b.m4818f(c1672z0, 0);
        c3161v0.f15851e.m4818f(c1672z0, 0);
        c3161v0.f15852f.m4818f(c1672z0, 0);
        c3161v0.f15853g.m4818f(c1672z0, 0);
        c3161v0.f15854h.m4818f(c1672z0, 0);
        c3161v0.f15855i.m4818f(c1672z0, 0);
        c3161v0.f15850d.m4818f(c1672z0, 0);
        c3161v0.f15857k.m4861f(AbstractC3122c.m4832e(c1672z0.f10450a.mo2672j(4)));
        c3161v0.f15858l.m4861f(AbstractC3122c.m4832e(c1672z0.f10450a.mo2672j(2)));
        c3161v0.f15859m.m4861f(AbstractC3122c.m4832e(c1672z0.f10450a.mo2672j(1)));
        c3161v0.f15860n.m4861f(AbstractC3122c.m4832e(c1672z0.f10450a.mo2672j(519)));
        c3161v0.f15861o.m4861f(AbstractC3122c.m4832e(c1672z0.f10450a.mo2672j(64)));
        C1624c mo2693h = c1672z0.f10450a.mo2693h();
        if (mo2693h != null) {
            c3161v0.f15856j.m4861f(AbstractC3122c.m4832e(mo2693h.m2638a()));
        }
        synchronized (AbstractC3465l.f16721c) {
            C2196i0 c2196i0 = AbstractC3465l.f16728j.f16673h;
            if (c2196i0 != null) {
                if (c2196i0.m3606h()) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            AbstractC3465l.m5234a();
        }
    }
}
