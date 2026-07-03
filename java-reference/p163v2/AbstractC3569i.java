package p163v2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p007ui.draw.AbstractC0166a;
import androidx.compose.p007ui.input.nestedscroll.AbstractC0170a;
import androidx.compose.p007ui.layout.AbstractC0172a;
import androidx.lifecycle.AbstractC0194j0;
import androidx.lifecycle.InterfaceC0213t;
import com.paoman.lema.R;
import java.util.LinkedHashMap;
import p001a0.C0037j;
import p006a7.C0129l;
import p012b3.C0274b;
import p028d2.AbstractC0479l;
import p032d6.AbstractC0525d0;
import p034e0.C0598c0;
import p039e5.C1341ul;
import p051g3.AbstractC1643l;
import p051g3.AbstractC1653q;
import p051g3.C1664v0;
import p051g3.C1672z0;
import p051g3.InterfaceC1631f;
import p060h5.AbstractC1804l;
import p065i2.AbstractC2064e;
import p068i5.AbstractC2080d;
import p073j2.AbstractC2168e;
import p077k.C2182b0;
import p085l0.C2387n;
import p085l0.InterfaceC2367i;
import p100n.C2649h1;
import p101n0.C2705e;
import p109o1.C2799d;
import p117p1.C2874y;
import p117p1.C2875z;
import p139s1.AbstractC3088a;
import p140s2.InterfaceC3093c;
import p146t1.AbstractC3191c1;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p160v.C3423m0;
import p161v0.C3473t;
import p161v0.C3474u;
import p162v1.C3502g0;
import p162v1.C3530p1;
import p162v1.C3537s;
import p162v1.InterfaceC3524n1;
import p162v1.InterfaceC3527o1;
import p170w1.AbstractC3719q2;
import p170w1.C3728t;
import p172w3.InterfaceC3782f;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.i */
/* loaded from: classes.dex */
public abstract class AbstractC3569i extends ViewGroup implements InterfaceC2367i, InterfaceC3527o1, InterfaceC1631f {

    /* renamed from: A */
    public final C0129l f17134A;

    /* renamed from: B */
    public boolean f17135B;

    /* renamed from: C */
    public final C3502g0 f17136C;

    /* renamed from: e */
    public final C2799d f17137e;

    /* renamed from: f */
    public final View f17138f;

    /* renamed from: g */
    public final InterfaceC3524n1 f17139g;

    /* renamed from: h */
    public InterfaceC3277a f17140h;

    /* renamed from: i */
    public boolean f17141i;

    /* renamed from: j */
    public InterfaceC3277a f17142j;

    /* renamed from: k */
    public InterfaceC3277a f17143k;

    /* renamed from: l */
    public InterfaceC3810r f17144l;

    /* renamed from: m */
    public InterfaceC3279c f17145m;

    /* renamed from: n */
    public InterfaceC3093c f17146n;

    /* renamed from: o */
    public InterfaceC3279c f17147o;

    /* renamed from: p */
    public InterfaceC0213t f17148p;

    /* renamed from: q */
    public InterfaceC3782f f17149q;

    /* renamed from: r */
    public final int[] f17150r;

    /* renamed from: s */
    public long f17151s;

    /* renamed from: t */
    public C1672z0 f17152t;

    /* renamed from: u */
    public final C3568h f17153u;

    /* renamed from: v */
    public final C3568h f17154v;

    /* renamed from: w */
    public InterfaceC3279c f17155w;

    /* renamed from: x */
    public final int[] f17156x;

    /* renamed from: y */
    public int f17157y;

    /* renamed from: z */
    public int f17158z;

    public AbstractC3569i(Context context, C2387n c2387n, int i7, C2799d c2799d, View view, InterfaceC3524n1 interfaceC3524n1) {
        super(context);
        this.f17137e = c2799d;
        this.f17138f = view;
        this.f17139g = interfaceC3524n1;
        LinkedHashMap linkedHashMap = AbstractC3719q2.f17680a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c2387n);
        int i8 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        C3576p c3576p = (C3576p) this;
        AbstractC1653q.m2699b(this, new C3562b(c3576p, i8));
        AbstractC1643l.m2651b(this, this);
        this.f17140h = C3567g.f17130i;
        this.f17142j = C3567g.f17129h;
        this.f17143k = C3567g.f17128g;
        C3807o c3807o = C3807o.f17991a;
        this.f17144l = c3807o;
        this.f17146n = AbstractC2080d.m3389b();
        int i9 = 2;
        this.f17150r = new int[2];
        this.f17151s = 0L;
        this.f17153u = new C3568h(c3576p, 1);
        this.f17154v = new C3568h(c3576p, i8);
        this.f17156x = new int[2];
        this.f17157y = Integer.MIN_VALUE;
        this.f17158z = Integer.MIN_VALUE;
        this.f17134A = new C0129l(11);
        int i10 = 3;
        C3502g0 c3502g0 = new C3502g0(3);
        c3502g0.f16897r = c3576p;
        InterfaceC3810r m1037a = AbstractC0479l.m1037a(AbstractC0170a.m389a(c3807o, AbstractC3570j.f17159a, c2799d), true, C3563c.f17116i);
        C2874y c2874y = new C2874y();
        c2874y.f15039a = new C2875z(c3576p, 0);
        C1341ul c1341ul = new C1341ul();
        C1341ul c1341ul2 = c2874y.f15040b;
        if (c1341ul2 != null) {
            c1341ul2.f7975f = null;
        }
        c2874y.f15040b = c1341ul;
        c1341ul.f7975f = c2874y;
        setOnRequestDisallowInterceptTouchEvent$ui_release(c1341ul);
        InterfaceC3810r m394d = AbstractC0172a.m394d(AbstractC0166a.m378a(m1037a.mo5829e(c2874y), new C0037j(c3576p, c3502g0, c3576p, 13)), new C3564d(c3576p, c3502g0, i9));
        c3502g0.m5432g0(this.f17144l.mo5829e(m394d));
        this.f17145m = new C2649h1(15, c3502g0, m394d);
        c3502g0.m5424c0(this.f17146n);
        this.f17147o = new C3423m0(i10, c3502g0);
        c3502g0.f16879P = new C3564d(c3576p, c3502g0, i8);
        c3502g0.f16880Q = new C2875z(c3576p, 1);
        c3502g0.m5430f0(new C3565e(c3576p, c3502g0));
        this.f17136C = c3502g0;
    }

    /* renamed from: e */
    public static final int m5538e(C3576p c3576p, int i7, int i8, int i9) {
        if (i9 < 0 && i7 != i8) {
            if (i9 == -2 && i8 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
            }
            if (i9 == -1 && i8 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(AbstractC2168e.m3530q(i9, i7, i8), 1073741824);
    }

    /* renamed from: f */
    public static C0274b m5539f(C0274b c0274b, int i7, int i8, int i9, int i10) {
        int i11 = c0274b.f1015a - i7;
        int i12 = 0;
        if (i11 < 0) {
            i11 = 0;
        }
        int i13 = c0274b.f1016b - i8;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = c0274b.f1017c - i9;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = c0274b.f1018d - i10;
        if (i15 >= 0) {
            i12 = i15;
        }
        return C0274b.m581b(i11, i13, i14, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3530p1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC3088a.m4750b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((C3728t) this.f17139g).getSnapshotObserver();
    }

    @Override // p085l0.InterfaceC2367i
    /* renamed from: a */
    public final void mo3796a() {
        this.f17143k.mo52a();
    }

    @Override // p085l0.InterfaceC2367i
    /* renamed from: b */
    public final void mo3797b() {
        this.f17142j.mo52a();
        removeAllViewsInLayout();
    }

    @Override // p051g3.InterfaceC1631f
    /* renamed from: c */
    public final C1672z0 mo2644c(View view, C1672z0 c1672z0) {
        this.f17152t = new C1672z0(c1672z0);
        return m5540g(c1672z0);
    }

    /* renamed from: g */
    public final C1672z0 m5540g(C1672z0 c1672z0) {
        C1664v0 c1664v0 = c1672z0.f10450a;
        C0274b mo2671i = c1664v0.mo2671i(-1);
        C0274b c0274b = C0274b.f1014e;
        if (!mo2671i.equals(c0274b) || !c1664v0.mo2672j(-9).equals(c0274b) || c1664v0.mo2693h() != null) {
            C3537s c3537s = this.f17136C.f16872I.f16799c;
            if (c3537s.f17011T.f18005r) {
                long m3225F = AbstractC2064e.m3225F(c3537s.mo4927U(0L));
                int i7 = (int) (m3225F >> 32);
                int i8 = 0;
                if (i7 < 0) {
                    i7 = 0;
                }
                int i9 = (int) (m3225F & 4294967295L);
                if (i9 < 0) {
                    i9 = 0;
                }
                long mo4926S = AbstractC3191c1.m4897h(c3537s).mo4926S();
                int i10 = (int) (mo4926S >> 32);
                int i11 = (int) (mo4926S & 4294967295L);
                long j6 = c3537s.f16055g;
                long m3225F2 = AbstractC2064e.m3225F(c3537s.mo4927U((Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L)));
                int i12 = i10 - ((int) (m3225F2 >> 32));
                if (i12 < 0) {
                    i12 = 0;
                }
                int i13 = i11 - ((int) (4294967295L & m3225F2));
                if (i13 >= 0) {
                    i8 = i13;
                }
                if (i7 != 0 || i9 != 0 || i12 != 0 || i8 != 0) {
                    return c1672z0.f10450a.mo2676r(i7, i9, i12, i8);
                }
            }
        }
        return c1672z0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f17156x;
        getLocationInWindow(iArr);
        int i7 = iArr[0];
        region.op(i7, iArr[1], getWidth() + i7, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC3093c getDensity() {
        return this.f17146n;
    }

    public final View getInteropView() {
        return this.f17138f;
    }

    public final C3502g0 getLayoutNode() {
        return this.f17136C;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f17138f.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final InterfaceC0213t getLifecycleOwner() {
        return this.f17148p;
    }

    public final InterfaceC3810r getModifier() {
        return this.f17144l;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        this.f17134A.getClass();
        return 0;
    }

    public final InterfaceC3279c getOnDensityChanged$ui_release() {
        return this.f17147o;
    }

    public final InterfaceC3279c getOnModifierChanged$ui_release() {
        return this.f17145m;
    }

    public final InterfaceC3279c getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f17155w;
    }

    public final InterfaceC3277a getRelease() {
        return this.f17143k;
    }

    public final InterfaceC3277a getReset() {
        return this.f17142j;
    }

    public final InterfaceC3782f getSavedStateRegistryOwner() {
        return this.f17149q;
    }

    public final InterfaceC3277a getUpdate() {
        return this.f17140h;
    }

    public final View getView() {
        return this.f17138f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (this.f17135B) {
            this.f17138f.postOnAnimation(new RunnableC3561a(0, this.f17154v));
            return null;
        }
        this.f17136C.m5401C();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f17138f.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17153u.mo52a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.f17135B) {
            this.f17138f.postOnAnimation(new RunnableC3561a(0, this.f17154v));
        } else {
            this.f17136C.m5401C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0088 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000e, B:6:0x0016, B:9:0x0080, B:11:0x0088, B:13:0x0098, B:15:0x008d, B:18:0x0029, B:21:0x0035, B:23:0x004a, B:25:0x0056, B:27:0x0060, B:29:0x0070, B:36:0x007b, B:39:0x009c), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        int i7;
        int i8;
        super.onDetachedFromWindow();
        C3474u c3474u = getSnapshotObserver().f16991a;
        synchronized (c3474u.f16759g) {
            try {
                C2705e c2705e = c3474u.f16758f;
                int i9 = c2705e.f14519g;
                int i10 = 0;
                int i11 = 0;
                while (i10 < i9) {
                    C3473t c3473t = (C3473t) c2705e.f14517e[i10];
                    C2182b0 c2182b0 = (C2182b0) c3473t.f16746f.m3596k(this);
                    if (c2182b0 != null) {
                        Object[] objArr = c2182b0.f12622b;
                        int[] iArr = c2182b0.f12623c;
                        long[] jArr = c2182b0.f12621a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j6 = jArr[i12];
                                i7 = i10;
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8;
                                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                                    int i15 = 0;
                                    while (i15 < i14) {
                                        if ((j6 & 255) < 128) {
                                            int i16 = (i12 << 3) + i15;
                                            i8 = i13;
                                            Object obj = objArr[i16];
                                            int i17 = iArr[i16];
                                            c3473t.m5276d(this, obj);
                                        } else {
                                            i8 = i13;
                                        }
                                        j6 >>= i8;
                                        i15++;
                                        i13 = i8;
                                    }
                                    if (i14 != i13) {
                                        break;
                                    }
                                }
                                if (i12 == length) {
                                    break;
                                }
                                i12++;
                                i10 = i7;
                            }
                            if (c3473t.f16746f.m3595j()) {
                                i11++;
                            } else if (i11 > 0) {
                                Object[] objArr2 = c2705e.f14517e;
                                objArr2[i7 - i11] = objArr2[i7];
                            }
                            i10 = i7 + 1;
                        }
                    }
                    i7 = i10;
                    if (c3473t.f16746f.m3595j()) {
                    }
                    i10 = i7 + 1;
                }
                int i18 = i9 - i11;
                AbstractC1804l.m3023P(c2705e.f14517e, i18, i9);
                c2705e.f14519g = i18;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        this.f17138f.layout(0, 0, i9 - i7, i10 - i8);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        View view = this.f17138f;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i8));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i7, i8);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f17157y = i7;
        this.f17158z = i8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z7) {
        if (!this.f17138f.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC0525d0.m1141s(this.f17137e.m4433c(), null, new C3566f(z7, this, AbstractC2168e.m3522i(f7 * (-1.0f), f8 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        if (!this.f17138f.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC0525d0.m1141s(this.f17137e.m4433c(), null, new C0598c0(this, AbstractC2168e.m3522i(f7 * (-1.0f), f8 * (-1.0f)), null, 3), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        InterfaceC3279c interfaceC3279c = this.f17155w;
        if (interfaceC3279c != null) {
            interfaceC3279c.mo23f(Boolean.valueOf(z7));
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    public final void setDensity(InterfaceC3093c interfaceC3093c) {
        if (interfaceC3093c != this.f17146n) {
            this.f17146n = interfaceC3093c;
            InterfaceC3279c interfaceC3279c = this.f17147o;
            if (interfaceC3279c != null) {
                interfaceC3279c.mo23f(interfaceC3093c);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC0213t interfaceC0213t) {
        if (interfaceC0213t != this.f17148p) {
            this.f17148p = interfaceC0213t;
            AbstractC0194j0.m461f(this, interfaceC0213t);
        }
    }

    public final void setModifier(InterfaceC3810r interfaceC3810r) {
        if (interfaceC3810r != this.f17144l) {
            this.f17144l = interfaceC3810r;
            InterfaceC3279c interfaceC3279c = this.f17145m;
            if (interfaceC3279c != null) {
                interfaceC3279c.mo23f(interfaceC3810r);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(InterfaceC3279c interfaceC3279c) {
        this.f17147o = interfaceC3279c;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC3279c interfaceC3279c) {
        this.f17145m = interfaceC3279c;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC3279c interfaceC3279c) {
        this.f17155w = interfaceC3279c;
    }

    public final void setRelease(InterfaceC3277a interfaceC3277a) {
        this.f17143k = interfaceC3277a;
    }

    public final void setReset(InterfaceC3277a interfaceC3277a) {
        this.f17142j = interfaceC3277a;
    }

    public final void setSavedStateRegistryOwner(InterfaceC3782f interfaceC3782f) {
        if (interfaceC3782f != this.f17149q) {
            this.f17149q = interfaceC3782f;
            setTag(R.id.view_tree_saved_state_registry_owner, interfaceC3782f);
        }
    }

    public final void setUpdate(InterfaceC3277a interfaceC3277a) {
        this.f17140h = interfaceC3277a;
        this.f17141i = true;
        this.f17153u.mo52a();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // p162v1.InterfaceC3527o1
    /* renamed from: z */
    public final boolean mo5303z() {
        return isAttachedToWindow();
    }
}
