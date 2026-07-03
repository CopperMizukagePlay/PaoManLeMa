package p035e1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import p023c5.C0427s;
import p027d1.C0465c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.b */
/* loaded from: classes.dex */
public final class C0644b implements InterfaceC0674q {

    /* renamed from: a */
    public Canvas f2123a = AbstractC0646c.f2129a;

    /* renamed from: b */
    public Rect f2124b;

    /* renamed from: c */
    public Rect f2125c;

    @Override // p035e1.InterfaceC0674q
    /* renamed from: a */
    public final void mo1329a(C0654g c0654g, long j6, long j7, long j8, C0427s c0427s) {
        if (this.f2124b == null) {
            this.f2124b = new Rect();
            this.f2125c = new Rect();
        }
        Canvas canvas = this.f2123a;
        if (c0654g != null) {
            Bitmap bitmap = c0654g.f2144a;
            Rect rect = this.f2124b;
            AbstractC3367j.m5097b(rect);
            int i7 = (int) (j6 >> 32);
            rect.left = i7;
            int i8 = (int) (j6 & 4294967295L);
            rect.top = i8;
            rect.right = i7 + ((int) (j7 >> 32));
            rect.bottom = i8 + ((int) (j7 & 4294967295L));
            Rect rect2 = this.f2125c;
            AbstractC3367j.m5097b(rect2);
            int i9 = (int) 0;
            rect2.left = i9;
            int i10 = (int) 0;
            rect2.top = i10;
            rect2.right = i9 + ((int) (j8 >> 32));
            rect2.bottom = i10 + ((int) (4294967295L & j8));
            canvas.drawBitmap(bitmap, rect, rect2, (Paint) c0427s.f1462g);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: b */
    public final void mo1330b(float f7, float f8) {
        this.f2123a.scale(f7, f8);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: c */
    public final void mo1331c(float f7, long j6, C0427s c0427s) {
        this.f2123a.drawCircle(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), f7, (Paint) c0427s.f1462g);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: d */
    public final void mo1332d(C0660j c0660j, C0427s c0427s) {
        Canvas canvas = this.f2123a;
        if (c0660j instanceof C0660j) {
            canvas.drawPath(c0660j.f2151a, (Paint) c0427s.f1462g);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: e */
    public final void mo1333e(float f7, float f8, float f9, float f10, float f11, float f12, C0427s c0427s) {
        this.f2123a.drawArc(f7, f8, f9, f10, f11, f12, false, (Paint) c0427s.f1462g);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: f */
    public final void mo1334f(float f7, float f8, float f9, float f10, C0427s c0427s) {
        this.f2123a.drawRect(f7, f8, f9, f10, (Paint) c0427s.f1462g);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: g */
    public final void mo1335g(float f7, float f8, float f9, float f10, int i7) {
        Region.Op op;
        Canvas canvas = this.f2123a;
        if (i7 == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f7, f8, f9, f10, op);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: h */
    public final void mo1336h(float f7, float f8) {
        this.f2123a.translate(f7, f8);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: i */
    public final void mo1337i() {
        this.f2123a.rotate(45.0f);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: j */
    public final void mo1338j() {
        this.f2123a.restore();
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: k */
    public final void mo1339k(C0465c c0465c, C0427s c0427s) {
        this.f2123a.saveLayer(c0465c.f1625a, c0465c.f1626b, c0465c.f1627c, c0465c.f1628d, (Paint) c0427s.f1462g, 31);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: l */
    public final void mo1340l(float f7, float f8, float f9, float f10, float f11, float f12, C0427s c0427s) {
        this.f2123a.drawRoundRect(f7, f8, f9, f10, f11, f12, (Paint) c0427s.f1462g);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: m */
    public final void mo1341m() {
        this.f2123a.save();
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: n */
    public final void mo1342n(long j6, long j7, C0427s c0427s) {
        this.f2123a.drawLine(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), (Paint) c0427s.f1462g);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: o */
    public final void mo1343o() {
        AbstractC0659i0.m1413m(this.f2123a, false);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: q */
    public final void mo1344q(C0660j c0660j) {
        Canvas canvas = this.f2123a;
        if (c0660j instanceof C0660j) {
            canvas.clipPath(c0660j.f2151a, Region.Op.INTERSECT);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: r */
    public final void mo1345r(float[] fArr) {
        if (!AbstractC0659i0.m1414n(fArr)) {
            Matrix matrix = new Matrix();
            AbstractC0659i0.m1419s(matrix, fArr);
            this.f2123a.concat(matrix);
        }
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: s */
    public final void mo1346s() {
        AbstractC0659i0.m1413m(this.f2123a, true);
    }

    @Override // p035e1.InterfaceC0674q
    /* renamed from: t */
    public final void mo1347t(C0654g c0654g, C0427s c0427s) {
        this.f2123a.drawBitmap(c0654g.f2144a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) c0427s.f1462g);
    }
}
