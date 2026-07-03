package p165v4;

import p022c4.C0400j;
import p022c4.C0406p;
import p067i4.C2069b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v4.c */
/* loaded from: classes.dex */
public final class C3589c {

    /* renamed from: a */
    public final C2069b f17232a;

    /* renamed from: b */
    public final C0406p f17233b;

    /* renamed from: c */
    public final C0406p f17234c;

    /* renamed from: d */
    public final C0406p f17235d;

    /* renamed from: e */
    public final C0406p f17236e;

    /* renamed from: f */
    public final int f17237f;

    /* renamed from: g */
    public final int f17238g;

    /* renamed from: h */
    public final int f17239h;

    /* renamed from: i */
    public final int f17240i;

    public C3589c(C2069b c2069b, C0406p c0406p, C0406p c0406p2, C0406p c0406p3, C0406p c0406p4) {
        boolean z7 = c0406p == null || c0406p2 == null;
        boolean z8 = c0406p3 == null || c0406p4 == null;
        if (z7 && z8) {
            throw C0400j.m878a();
        }
        if (z7) {
            c0406p = new C0406p(0.0f, c0406p3.f1391b);
            c0406p2 = new C0406p(0.0f, c0406p4.f1391b);
        } else if (z8) {
            int i7 = c2069b.f12258e;
            c0406p3 = new C0406p(i7 - 1, c0406p.f1391b);
            c0406p4 = new C0406p(i7 - 1, c0406p2.f1391b);
        }
        this.f17232a = c2069b;
        this.f17233b = c0406p;
        this.f17234c = c0406p2;
        this.f17235d = c0406p3;
        this.f17236e = c0406p4;
        this.f17237f = (int) Math.min(c0406p.f1390a, c0406p2.f1390a);
        this.f17238g = (int) Math.max(c0406p3.f1390a, c0406p4.f1390a);
        this.f17239h = (int) Math.min(c0406p.f1391b, c0406p3.f1391b);
        this.f17240i = (int) Math.max(c0406p2.f1391b, c0406p4.f1391b);
    }

    public C3589c(C3589c c3589c) {
        this.f17232a = c3589c.f17232a;
        this.f17233b = c3589c.f17233b;
        this.f17234c = c3589c.f17234c;
        this.f17235d = c3589c.f17235d;
        this.f17236e = c3589c.f17236e;
        this.f17237f = c3589c.f17237f;
        this.f17238g = c3589c.f17238g;
        this.f17239h = c3589c.f17239h;
        this.f17240i = c3589c.f17240i;
    }
}
