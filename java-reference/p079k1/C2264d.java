package p079k1;

import java.util.ArrayList;
import p035e1.C0671o0;
import p035e1.C0677s;
import p060h5.C1813u;
import p139s1.AbstractC3088a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.d */
/* loaded from: classes.dex */
public final class C2264d {

    /* renamed from: a */
    public final String f13118a;

    /* renamed from: b */
    public final float f13119b;

    /* renamed from: c */
    public final float f13120c;

    /* renamed from: d */
    public final float f13121d;

    /* renamed from: e */
    public final float f13122e;

    /* renamed from: f */
    public final long f13123f;

    /* renamed from: g */
    public final int f13124g;

    /* renamed from: h */
    public final boolean f13125h;

    /* renamed from: i */
    public final ArrayList f13126i;

    /* renamed from: j */
    public final C2262c f13127j;

    /* renamed from: k */
    public boolean f13128k;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k1.c] */
    public C2264d(String str, boolean z7) {
        long j6 = C0677s.f2209g;
        this.f13118a = str;
        this.f13119b = 24.0f;
        this.f13120c = 24.0f;
        this.f13121d = 24.0f;
        this.f13122e = 24.0f;
        this.f13123f = j6;
        this.f13124g = 5;
        this.f13125h = z7;
        ArrayList arrayList = new ArrayList();
        this.f13126i = arrayList;
        int i7 = AbstractC2263c0.f13117a;
        ArrayList arrayList2 = new ArrayList();
        ?? obj = new Object();
        obj.f13115a = C1813u.f10860e;
        obj.f13116b = arrayList2;
        this.f13127j = obj;
        arrayList.add(obj);
    }

    /* renamed from: a */
    public static void m3672a(C2264d c2264d, ArrayList arrayList, C0671o0 c0671o0) {
        if (c2264d.f13128k) {
            AbstractC3088a.m4750b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C2262c) c2264d.f13126i.get(r1.size() - 1)).f13116b.add(new C2269f0(arrayList, c0671o0));
    }

    /* renamed from: b */
    public final C2266e m3673b() {
        if (this.f13128k) {
            AbstractC3088a.m4750b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f13126i;
            if (arrayList.size() > 1) {
                if (this.f13128k) {
                    AbstractC3088a.m4750b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                C2262c c2262c = (C2262c) arrayList.remove(arrayList.size() - 1);
                ArrayList arrayList2 = ((C2262c) arrayList.get(arrayList.size() - 1)).f13116b;
                c2262c.getClass();
                arrayList2.add(new C2261b0(c2262c.f13115a, c2262c.f13116b));
            } else {
                C2262c c2262c2 = this.f13127j;
                c2262c2.getClass();
                C2266e c2266e = new C2266e(this.f13118a, this.f13119b, this.f13120c, this.f13121d, this.f13122e, new C2261b0(c2262c2.f13115a, c2262c2.f13116b), this.f13123f, this.f13124g, this.f13125h);
                this.f13128k = true;
                return c2266e;
            }
        }
    }
}
