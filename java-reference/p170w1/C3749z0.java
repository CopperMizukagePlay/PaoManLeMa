package p170w1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import p035e1.AbstractC0659i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.z0 */
/* loaded from: classes.dex */
public final class C3749z0 implements InterfaceC3746y0 {

    /* renamed from: e */
    public final Matrix f17818e = new Matrix();

    /* renamed from: f */
    public final int[] f17819f = new int[2];

    @Override // p170w1.InterfaceC3746y0
    /* renamed from: g */
    public void mo143g(View view, float[] fArr) {
        Matrix matrix = this.f17818e;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f17819f;
        view.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        int i8 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i7, iArr[1] - i8);
        AbstractC0659i0.m1420t(matrix, fArr);
    }
}
