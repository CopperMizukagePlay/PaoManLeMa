package p117p1;

import android.view.MotionEvent;
import p001a0.C0068q2;
import p027d1.C0464b;
import p034e0.C0614k0;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.q */
/* loaded from: classes.dex */
public abstract class AbstractC2866q {

    /* renamed from: a */
    public static final C2842a f15003a = new C2842a(1000);

    /* renamed from: b */
    public static final StackTraceElement[] f15004b;

    static {
        new C2842a(1007);
        new C2842a(1008);
        new C2842a(1002);
        f15004b = new StackTraceElement[0];
    }

    /* renamed from: a */
    public static final boolean m4542a(C2868s c2868s) {
        if (!c2868s.f15013h && c2868s.f15009d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m4543b(C2868s c2868s) {
        if (!c2868s.m4551b() && c2868s.f15013h && !c2868s.f15009d) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m4544c(C2868s c2868s) {
        if (c2868s.f15013h && !c2868s.f15009d) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m4545d(C2868s c2868s, long j6, long j7) {
        int i7;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = false;
        if (c2868s.f15014i == 1) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        long j8 = c2868s.f15008c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        float f7 = i7;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j7 >> 32)) * f7;
        float f8 = ((int) (j6 >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j7 & 4294967295L)) * f7;
        float f9 = ((int) (j6 & 4294967295L)) + intBitsToFloat4;
        if (intBitsToFloat < (-intBitsToFloat3)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (intBitsToFloat > f8) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z11 = z8 | z7;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z12 = z11 | z9;
        if (intBitsToFloat2 > f9) {
            z10 = true;
        }
        return z12 | z10;
    }

    /* renamed from: e */
    public static final long m4546e(C2868s c2868s, boolean z7) {
        long m1010f = C0464b.m1010f(c2868s.f15008c, c2868s.f15012g);
        if (!z7 && c2868s.m4551b()) {
            return 0L;
        }
        return m1010f;
    }

    /* renamed from: f */
    public static final void m4547f(C2859j c2859j, long j6, InterfaceC3279c interfaceC3279c, boolean z7) {
        MotionEvent motionEvent;
        C0614k0 c0614k0 = c2859j.f14992b;
        if (c0614k0 != null) {
            motionEvent = (MotionEvent) ((C0068q2) c0614k0.f2019d).f345g;
        } else {
            motionEvent = null;
        }
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (z7) {
                motionEvent.setAction(3);
            }
            int i7 = (int) (j6 >> 32);
            int i8 = (int) (j6 & 4294967295L);
            motionEvent.offsetLocation(-Float.intBitsToFloat(i7), -Float.intBitsToFloat(i8));
            interfaceC3279c.mo23f(motionEvent);
            motionEvent.offsetLocation(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8));
            motionEvent.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}
