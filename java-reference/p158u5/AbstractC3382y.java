package p158u5;

import java.util.Map;
import p053g5.InterfaceC1684c;
import p092m.AbstractC2487d;
import p145t0.InterfaceC3171b;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p150t5.InterfaceC3283g;
import p150t5.InterfaceC3284h;
import p166v5.InterfaceC3594a;
import p166v5.InterfaceC3597d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u5.y */
/* loaded from: classes.dex */
public abstract class AbstractC3382y {
    /* renamed from: a */
    public static Map m5110a(Object obj) {
        if ((obj instanceof InterfaceC3594a) && !(obj instanceof InterfaceC3597d)) {
            m5113d(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e7) {
            AbstractC3367j.m5104i(e7, AbstractC3382y.class.getName());
            throw e7;
        }
    }

    /* renamed from: b */
    public static void m5111b(int i7, Object obj) {
        if (obj != null && !m5112c(i7, obj)) {
            m5113d(obj, "kotlin.jvm.functions.Function" + i7);
            throw null;
        }
    }

    /* renamed from: c */
    public static boolean m5112c(int i7, Object obj) {
        int i8;
        if (obj instanceof InterfaceC1684c) {
            if (obj instanceof InterfaceC3364g) {
                i8 = ((InterfaceC3364g) obj).mo4120b();
            } else if (obj instanceof InterfaceC3277a) {
                i8 = 0;
            } else if (obj instanceof InterfaceC3279c) {
                i8 = 1;
            } else if (obj instanceof InterfaceC3281e) {
                i8 = 2;
            } else if (obj instanceof InterfaceC3282f) {
                i8 = 3;
            } else if (obj instanceof InterfaceC3283g) {
                i8 = 4;
            } else if (obj instanceof InterfaceC3284h) {
                i8 = 5;
            } else {
                boolean z7 = obj instanceof InterfaceC3171b;
                if (z7) {
                    i8 = 6;
                } else if (z7) {
                    i8 = 7;
                } else if (z7) {
                    i8 = 8;
                } else if (z7) {
                    i8 = 9;
                } else if (z7) {
                    i8 = 10;
                } else if (z7) {
                    i8 = 11;
                } else if (z7) {
                    i8 = 13;
                } else if (z7) {
                    i8 = 14;
                } else if (z7) {
                    i8 = 15;
                } else if (z7) {
                    i8 = 16;
                } else if (z7) {
                    i8 = 17;
                } else if (z7) {
                    i8 = 18;
                } else if (z7) {
                    i8 = 19;
                } else if (z7) {
                    i8 = 20;
                } else if (z7) {
                    i8 = 21;
                } else {
                    i8 = -1;
                }
            }
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static void m5113d(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(AbstractC2487d.m4044h(name, " cannot be cast to ", str));
        AbstractC3367j.m5104i(classCastException, AbstractC3382y.class.getName());
        throw classCastException;
    }
}
