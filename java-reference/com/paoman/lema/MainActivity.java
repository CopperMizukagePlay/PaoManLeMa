package com.paoman.lema;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import p008b.AbstractActivityC0245m;
import p008b.AbstractC0249q;
import p008b.AbstractC0257y;
import p008b.C0242k0;
import p008b.C0244l0;
import p008b.C0248p;
import p008b.RunnableC0247o;
import p039e5.AbstractC0697a2;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0245m {

    /* renamed from: y */
    public static final /* synthetic */ int f1565y = 0;

    /* renamed from: x */
    public final C2361g1 f1566x = AbstractC2418w.m3980x(null);

    @Override // p008b.AbstractActivityC0245m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC3367j.m5100e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        r1.run();
        r9 = getWindow();
        p158u5.AbstractC3367j.m5099d(r9, "getWindow(...)");
        r2.mo544a(r9);
        r1 = new p145t0.C3173d(-245851642, new p039e5.C1324u4(r4, r8), true);
        r9 = p017c.AbstractC0324i.f1133a;
        r9 = ((android.view.ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
    
        if ((r9 instanceof p170w1.C3670e1) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        r9 = (p170w1.C3670e1) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
    
        if (r9 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f5, code lost:
    
        r9.setParentCompositionContext(null);
        r9.setContent(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
    
        r9 = new p170w1.C3670e1(r8);
        r9.setParentCompositionContext(null);
        r9.setContent(r1);
        r0 = getWindow().getDecorView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
    
        if (androidx.lifecycle.AbstractC0194j0.m458c(r0) != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0115, code lost:
    
        androidx.lifecycle.AbstractC0194j0.m461f(r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011c, code lost:
    
        if (androidx.lifecycle.AbstractC0194j0.m459d(r0) != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
    
        r0.setTag(com.paoman.lema.R.id.view_tree_view_model_store_owner, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0128, code lost:
    
        if (p067i4.AbstractC2072e.m3333j(r0) != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012a, code lost:
    
        r0.setTag(com.paoman.lema.R.id.view_tree_saved_state_registry_owner, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        setContentView(r9, p017c.AbstractC0324i.f1133a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0135, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p008b.AbstractActivityC0245m, p185y2.AbstractActivityC3848a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        AbstractC0257y abstractC0257y;
        super.onCreate(bundle);
        AbstractC0697a2.m1488a("MainActivity.onCreate");
        this.f1566x.setValue(getIntent());
        int i7 = 0;
        C0244l0 c0244l0 = new C0244l0(0, 0, new C0242k0(i7));
        C0244l0 c0244l02 = new C0244l0(AbstractC0249q.f976a, AbstractC0249q.f977b, new C0242k0(i7));
        View decorView = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView, "getDecorView(...)");
        AbstractC0257y abstractC0257y2 = AbstractC0249q.f978c;
        AbstractC0257y abstractC0257y3 = abstractC0257y2;
        if (abstractC0257y2 == null) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 35) {
                abstractC0257y = new Object();
            } else if (i8 >= 30) {
                abstractC0257y = new Object();
            } else if (i8 >= 29) {
                abstractC0257y = new Object();
            } else if (i8 >= 28) {
                abstractC0257y = new Object();
            } else if (i8 >= 26) {
                abstractC0257y = new Object();
            } else {
                abstractC0257y = new Object();
            }
            AbstractC0249q.f978c = abstractC0257y;
            abstractC0257y3 = abstractC0257y;
        }
        AbstractC0257y abstractC0257y4 = abstractC0257y3;
        RunnableC0247o runnableC0247o = new RunnableC0247o(abstractC0257y4, c0244l0, c0244l02, this, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i9 = 0;
        while (true) {
            int i10 = 8;
            if (i9 < viewGroup.getChildCount()) {
                int i11 = i9 + 1;
                View childAt = viewGroup.getChildAt(i9);
                if (childAt != null) {
                    if (childAt.getTag() instanceof AbstractC0257y) {
                        break;
                    } else {
                        i9 = i11;
                    }
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                C0248p c0248p = new C0248p(runnableC0247o, viewGroup.getContext());
                c0248p.setTag(abstractC0257y4);
                c0248p.setVisibility(8);
                c0248p.setWillNotDraw(true);
                viewGroup.addView(c0248p);
                break;
            }
        }
    }

    @Override // p008b.AbstractActivityC0245m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC3367j.m5100e(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        this.f1566x.setValue(intent);
    }
}
