package p117p1;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import p001a0.C0068q2;
import p034e0.C0614k0;
import p144t.AbstractC3122c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.j */
/* loaded from: classes.dex */
public final class C2859j {

    /* renamed from: a */
    public final Object f14991a;

    /* renamed from: b */
    public final C0614k0 f14992b;

    /* renamed from: c */
    public final int f14993c;

    /* renamed from: d */
    public int f14994d;

    public C2859j(List list, C0614k0 c0614k0) {
        MotionEvent motionEvent;
        int i7;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        this.f14991a = list;
        this.f14992b = c0614k0;
        if (Build.VERSION.SDK_INT >= 29) {
            if (c0614k0 != null) {
                motionEvent3 = (MotionEvent) ((C0068q2) c0614k0.f2019d).f345g;
            } else {
                motionEvent3 = null;
            }
            if (motionEvent3 != null) {
                motionEvent3.getClassification();
            }
        }
        if (c0614k0 != null) {
            motionEvent = (MotionEvent) ((C0068q2) c0614k0.f2019d).f345g;
        } else {
            motionEvent = null;
        }
        int i8 = 0;
        if (motionEvent != null) {
            i7 = motionEvent.getButtonState();
        } else {
            i7 = 0;
        }
        this.f14993c = i7;
        if (c0614k0 != null) {
            motionEvent2 = (MotionEvent) ((C0068q2) c0614k0.f2019d).f345g;
        } else {
            motionEvent2 = null;
        }
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent4 = c0614k0 != null ? (MotionEvent) ((C0068q2) c0614k0.f2019d).f345g : null;
        if (motionEvent4 != null) {
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i8 = 6;
                                break;
                            case AbstractC3122c.f15758c /* 9 */:
                                i8 = 4;
                                break;
                            case AbstractC3122c.f15760e /* 10 */:
                                i8 = 5;
                                break;
                        }
                    }
                    i8 = 3;
                }
                i8 = 2;
            }
            i8 = 1;
        } else {
            int size = list.size();
            while (i8 < size) {
                C2868s c2868s = (C2868s) list.get(i8);
                if (AbstractC2866q.m4544c(c2868s)) {
                    i8 = 2;
                } else if (AbstractC2866q.m4542a(c2868s)) {
                    i8 = 1;
                } else {
                    i8++;
                }
            }
            i8 = 3;
        }
        this.f14994d = i8;
    }
}
