package p035e1;

import android.graphics.Path;
import android.graphics.RectF;
import p027d1.C0465c;
import p027d1.C0466d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.j */
/* loaded from: classes.dex */
public final class C0660j {

    /* renamed from: a */
    public final Path f2151a;

    /* renamed from: b */
    public RectF f2152b;

    /* renamed from: c */
    public float[] f2153c;

    public C0660j(Path path) {
        this.f2151a = path;
    }

    /* renamed from: a */
    public static void m1427a(C0660j c0660j, C0466d c0466d) {
        if (c0660j.f2152b == null) {
            c0660j.f2152b = new RectF();
        }
        RectF rectF = c0660j.f2152b;
        AbstractC3367j.m5097b(rectF);
        float f7 = c0466d.f1629a;
        long j6 = c0466d.f1636h;
        long j7 = c0466d.f1635g;
        long j8 = c0466d.f1634f;
        long j9 = c0466d.f1633e;
        rectF.set(f7, c0466d.f1630b, c0466d.f1631c, c0466d.f1632d);
        if (c0660j.f2153c == null) {
            c0660j.f2153c = new float[8];
        }
        float[] fArr = c0660j.f2153c;
        AbstractC3367j.m5097b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j9 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j9 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j8 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j8 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j7 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j7 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j6 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j6 & 4294967295L));
        Path path = c0660j.f2151a;
        RectF rectF2 = c0660j.f2152b;
        AbstractC3367j.m5097b(rectF2);
        float[] fArr2 = c0660j.f2153c;
        AbstractC3367j.m5097b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    /* renamed from: b */
    public final C0465c m1428b() {
        if (this.f2152b == null) {
            this.f2152b = new RectF();
        }
        RectF rectF = this.f2152b;
        AbstractC3367j.m5097b(rectF);
        this.f2151a.computeBounds(rectF, true);
        return new C0465c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: c */
    public final void m1429c(float f7, float f8) {
        this.f2151a.lineTo(f7, f8);
    }

    /* renamed from: d */
    public final boolean m1430d(C0660j c0660j, C0660j c0660j2, int i7) {
        Path.Op op;
        if (i7 == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i7 == 1) {
            op = Path.Op.INTERSECT;
        } else if (i7 == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i7 == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        if (c0660j instanceof C0660j) {
            Path path = c0660j.f2151a;
            if (c0660j2 instanceof C0660j) {
                return this.f2151a.op(path, c0660j2.f2151a, op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: e */
    public final void m1431e() {
        this.f2151a.reset();
    }
}
