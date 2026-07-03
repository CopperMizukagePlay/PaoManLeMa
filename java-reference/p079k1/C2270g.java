package p079k1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;
import p035e1.AbstractC0664l;
import p035e1.C0660j;
import p035e1.C0662k;
import p035e1.C0671o0;
import p049g1.InterfaceC1570d;
import p060h5.C1813u;
import p068i5.AbstractC2080d;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.g */
/* loaded from: classes.dex */
public final class C2270g extends AbstractC2287x {

    /* renamed from: b */
    public C0671o0 f13153b;

    /* renamed from: c */
    public List f13154c;

    /* renamed from: d */
    public float f13155d;

    /* renamed from: e */
    public boolean f13156e;

    /* renamed from: f */
    public boolean f13157f;

    /* renamed from: g */
    public final C0660j f13158g;

    /* renamed from: h */
    public C0660j f13159h;

    /* renamed from: i */
    public final Object f13160i;

    public C2270g() {
        int i7 = AbstractC2263c0.f13117a;
        this.f13154c = C1813u.f10860e;
        this.f13155d = 1.0f;
        this.f13156e = true;
        C0660j m1445a = AbstractC0664l.m1445a();
        this.f13158g = m1445a;
        this.f13159h = m1445a;
        this.f13160i = AbstractC2710c.m4326I(C2268f.f13148g);
    }

    @Override // p079k1.AbstractC2287x
    /* renamed from: a */
    public final void mo3666a(InterfaceC1570d interfaceC1570d) {
        if (this.f13156e) {
            AbstractC2080d.m3386N(this.f13154c, this.f13158g);
            m3674e();
        } else if (this.f13157f) {
            m3674e();
        }
        this.f13156e = false;
        this.f13157f = false;
        C0671o0 c0671o0 = this.f13153b;
        if (c0671o0 != null) {
            InterfaceC1570d.m2541T(interfaceC1570d, this.f13159h, c0671o0, 1.0f, null, 56);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, g5.d] */
    /* renamed from: e */
    public final void m3674e() {
        boolean z7;
        Path path;
        float f7 = this.f13155d;
        C0660j c0660j = this.f13158g;
        if (f7 == 1.0f) {
            this.f13159h = c0660j;
            return;
        }
        if (AbstractC3367j.m5096a(this.f13159h, c0660j)) {
            this.f13159h = AbstractC0664l.m1445a();
        } else {
            Path.FillType fillType = this.f13159h.f2151a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            if (fillType == fillType2) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f13159h.f2151a.rewind();
            Path path2 = this.f13159h.f2151a;
            if (!z7) {
                fillType2 = Path.FillType.WINDING;
            }
            path2.setFillType(fillType2);
        }
        ?? r02 = this.f13160i;
        PathMeasure pathMeasure = ((C0662k) r02.getValue()).f2173a;
        if (c0660j != null) {
            path = c0660j.f2151a;
        } else {
            path = null;
        }
        pathMeasure.setPath(path, false);
        float length = ((C0662k) r02.getValue()).f2173a.getLength();
        float f8 = 0.0f * length;
        float f9 = ((this.f13155d + 0.0f) % 1.0f) * length;
        if (f8 > f9) {
            ((C0662k) r02.getValue()).m1443a(f8, length, this.f13159h);
            ((C0662k) r02.getValue()).m1443a(0.0f, f9, this.f13159h);
        } else {
            ((C0662k) r02.getValue()).m1443a(f8, f9, this.f13159h);
        }
    }

    public final String toString() {
        return this.f13158g.toString();
    }
}
