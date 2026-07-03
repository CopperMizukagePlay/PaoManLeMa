package com.paoman.lema;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001a0.C0075s1;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0545k;
import p032d6.C0565q1;
import p032d6.C0568r1;
import p039e5.AbstractC1092mk;
import p039e5.AbstractC1220qo;
import p039e5.C0725au;
import p039e5.C0833eb;
import p039e5.C0976ir;
import p039e5.C1100ms;
import p039e5.C1158oo;
import p039e5.C1247rk;
import p039e5.EnumC0749bm;
import p039e5.EnumC0865fb;
import p039e5.EnumC1070lt;
import p060h5.AbstractC1805m;
import p068i5.AbstractC2080d;
import p069i6.AbstractC2100m;
import p069i6.C2090c;
import p076j5.C2178a;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class FloatingSpeedService extends Service {

    /* renamed from: A */
    public static final /* synthetic */ int f1540A = 0;

    /* renamed from: e */
    public final C2090c f1541e;

    /* renamed from: f */
    public final C1100ms f1542f;

    /* renamed from: g */
    public C0565q1 f1543g;

    /* renamed from: h */
    public C0565q1 f1544h;

    /* renamed from: i */
    public WindowManager f1545i;

    /* renamed from: j */
    public C1158oo f1546j;

    /* renamed from: k */
    public EnumC0749bm f1547k;

    /* renamed from: l */
    public boolean f1548l;

    /* renamed from: m */
    public ArrayList f1549m;

    /* renamed from: n */
    public ArrayList f1550n;

    /* renamed from: o */
    public boolean f1551o;

    /* renamed from: p */
    public boolean f1552p;

    /* renamed from: q */
    public boolean f1553q;

    /* renamed from: r */
    public String f1554r;

    /* renamed from: s */
    public boolean f1555s;

    /* renamed from: t */
    public long f1556t;

    /* renamed from: u */
    public C0725au f1557u;

    /* renamed from: v */
    public EnumC0865fb f1558v;

    /* renamed from: w */
    public final ArrayList f1559w;

    /* renamed from: x */
    public final ArrayList f1560x;

    /* renamed from: y */
    public long f1561y;

    /* renamed from: z */
    public long f1562z;

    public FloatingSpeedService() {
        C0568r1 m1124b = AbstractC0525d0.m1124b();
        C2325e c2325e = AbstractC0549l0.f1898a;
        this.f1541e = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(m1124b, AbstractC2100m.f12376a));
        this.f1542f = new C1100ms();
        this.f1547k = EnumC0749bm.f2843e;
        this.f1549m = new ArrayList();
        this.f1550n = new ArrayList();
        this.f1554r = AbstractC1220qo.m2157b(250L);
        this.f1558v = EnumC0865fb.f3982e;
        this.f1559w = new ArrayList();
        this.f1560x = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.util.Collection] */
    /* renamed from: e */
    public static double m982e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return 0.0d;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((Number) obj).doubleValue() > 0.0d) {
                arrayList2.add(obj);
            }
        }
        ?? m3062z0 = AbstractC1805m.m3062z0(AbstractC1805m.m3061y0(arrayList2, C2178a.f12608g), 50);
        if (!m3062z0.isEmpty()) {
            arrayList = m3062z0;
        }
        return AbstractC1805m.m3040d0(arrayList);
    }

    /* renamed from: a */
    public final String m983a(double d7) {
        if (this.f1558v != EnumC0865fb.f3982e) {
            d7 /= 8.0d;
        }
        return String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d7)}, 1));
    }

    /* renamed from: b */
    public final void m984b() {
        C1158oo c1158oo = this.f1546j;
        if (c1158oo != null) {
            c1158oo.m2023f("跑满了吗", "测速完成 · 最高50点平均", m983a(m982e(this.f1559w)), m983a(m982e(this.f1560x)), m987f(), true, false);
        }
    }

    /* renamed from: c */
    public final void m985c() {
        String str;
        String str2;
        boolean z7;
        C1158oo c1158oo = this.f1546j;
        if (c1158oo != null) {
            EnumC0749bm enumC0749bm = this.f1547k;
            EnumC0749bm enumC0749bm2 = EnumC0749bm.f2844f;
            if (enumC0749bm == enumC0749bm2) {
                str = "ROOT Monitor";
            } else {
                str = "跑满了吗";
            }
            if (enumC0749bm == enumC0749bm2) {
                str2 = "网卡实时上下行 · 长按切换单位";
            } else {
                str2 = "点击切换监视器 · 长按切换单位";
            }
            String str3 = str2;
            String m987f = m987f();
            if (this.f1547k == EnumC0749bm.f2843e) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z8 = z7;
            c1158oo.m2023f(str, str3, "--", "--", m987f, z8, this.f1548l);
        }
    }

    /* renamed from: d */
    public final void m986d(boolean z7, boolean z8) {
        if (!this.f1548l) {
            this.f1548l = true;
            this.f1559w.clear();
            this.f1560x.clear();
            this.f1561y = 0L;
            this.f1562z = 0L;
            C1158oo c1158oo = this.f1546j;
            if (c1158oo != null) {
                c1158oo.f6710l.clear();
                c1158oo.f6711m.clear();
                c1158oo.invalidate();
            }
            m985c();
            C1247rk c1247rk = C1247rk.f7381h;
            c1247rk.m2197k(this);
            ArrayList arrayList = this.f1549m;
            ArrayList arrayList2 = this.f1550n;
            boolean z9 = this.f1551o;
            long j6 = this.f1556t;
            Long valueOf = Long.valueOf(j6);
            if (j6 <= 0) {
                valueOf = null;
            }
            Long l7 = valueOf;
            boolean z10 = this.f1552p;
            boolean z11 = this.f1555s;
            boolean z12 = this.f1553q;
            List list = AbstractC1220qo.f7143a;
            String str = this.f1554r;
            boolean z13 = this.f1551o;
            AbstractC3367j.m5100e(str, "text");
            long m2156a = AbstractC1220qo.m2156a(str);
            if (z13) {
                m2156a = Math.max(m2156a, 1000L);
            }
            EnumC1070lt m1756Y2 = AbstractC1092mk.m1756Y2(this);
            C1100ms.m1896Q0(this.f1542f, arrayList, arrayList2, null, null, z7, z8, z9, l7, null, null, z10, z11, z12, m2156a, m1756Y2, null, false, null, null, null, null, 0, 134092556);
            C1100ms c1100ms = this.f1542f;
            if (!((C0976ir) c1100ms.f6087j1.f10535e.getValue()).f4968a && !((C0976ir) c1100ms.f6087j1.f10535e.getValue()).f4969b) {
                this.f1548l = false;
                c1247rk.m2202v();
            }
        }
    }

    /* renamed from: f */
    public final String m987f() {
        if (this.f1558v == EnumC0865fb.f3982e) {
            return "Mbps";
        }
        return "MB/s";
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        WindowManager windowManager;
        C0565q1 c0565q1 = this.f1543g;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        C0565q1 c0565q12 = this.f1544h;
        if (c0565q12 != null) {
            c0565q12.mo1114c(null);
        }
        this.f1542f.m1962S0();
        C1247rk.f7381h.m2202v();
        C1158oo c1158oo = this.f1546j;
        if (c1158oo != null && (windowManager = this.f1545i) != null) {
            windowManager.removeView(c1158oo);
        }
        this.f1546j = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        String str;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        boolean z7;
        boolean z8;
        boolean z9;
        String str2;
        boolean z10;
        long j6;
        int i9;
        InterfaceC2313c interfaceC2313c = null;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (AbstractC3367j.m5096a(str, "com.paoman.lema.FLOATING_STOP")) {
            stopSelf();
            return 2;
        }
        if (intent == null || (arrayList = intent.getStringArrayListExtra("download_urls")) == null) {
            arrayList = this.f1549m;
        }
        this.f1549m = arrayList;
        if (intent == null || (arrayList2 = intent.getStringArrayListExtra("upload_urls")) == null) {
            arrayList2 = this.f1550n;
        }
        this.f1550n = arrayList2;
        if (intent != null) {
            z7 = intent.getBooleanExtra("use_root_stats", this.f1551o);
        } else {
            z7 = this.f1551o;
        }
        this.f1551o = z7;
        if (intent != null) {
            z8 = intent.getBooleanExtra("high_throughput_mode", this.f1552p);
        } else {
            z8 = this.f1552p;
        }
        this.f1552p = z8;
        if (intent != null) {
            z9 = intent.getBooleanExtra("extreme_mode", this.f1553q);
        } else {
            z9 = this.f1553q;
        }
        this.f1553q = z9;
        if (intent == null || (str2 = intent.getStringExtra("sample_interval")) == null) {
            str2 = this.f1554r;
        }
        this.f1554r = str2;
        if (intent != null) {
            z10 = intent.getBooleanExtra("redirect_enhancement_mode", this.f1555s);
        } else {
            z10 = this.f1555s;
        }
        this.f1555s = z10;
        if (intent != null) {
            j6 = intent.getLongExtra("duration_millis", this.f1556t);
        } else {
            j6 = this.f1556t;
        }
        this.f1556t = j6;
        if (this.f1546j == null) {
            Object systemService = getSystemService("window");
            AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f1545i = (WindowManager) systemService;
            C1158oo c1158oo = new C1158oo(this);
            c1158oo.f6703e = new C0833eb(this, 0);
            c1158oo.f6704f = new C0833eb(this, 1);
            c1158oo.f6705g = new C0833eb(this, 2);
            c1158oo.f6706h = new C0833eb(this, 3);
            c1158oo.f6707i = new C0833eb(this, 4);
            c1158oo.f6708j = new C0833eb(this, 5);
            c1158oo.f6709k = new C0545k(1, this);
            this.f1546j = c1158oo;
            if (Build.VERSION.SDK_INT >= 26) {
                i9 = 2038;
            } else {
                i9 = 2002;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(500, 410, i9, 8, -3);
            layoutParams.gravity = 8388693;
            layoutParams.x = 28;
            layoutParams.y = 120;
            WindowManager windowManager = this.f1545i;
            if (windowManager != null) {
                windowManager.addView(this.f1546j, layoutParams);
            }
            m985c();
            C0565q1 c0565q1 = this.f1543g;
            if (c0565q1 != null) {
                c0565q1.mo1114c(null);
            }
            this.f1543g = AbstractC0525d0.m1141s(this.f1541e, null, new C0075s1(this, interfaceC2313c, 1), 3);
        }
        return 1;
    }
}
