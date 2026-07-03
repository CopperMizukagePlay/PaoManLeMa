package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import p006a7.C0129l;
import p065i2.AbstractC2064e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.q0 */
/* loaded from: classes.dex */
public final class C0208q0 extends C0129l {

    /* renamed from: e */
    public static C0208q0 f873e;

    /* renamed from: f */
    public static final C0129l f874f = new C0129l(4);

    /* renamed from: d */
    public final Application f875d;

    public C0208q0(Application application) {
        super(5);
        this.f875d = application;
    }

    @Override // p006a7.C0129l, androidx.lifecycle.InterfaceC0210r0
    /* renamed from: a */
    public final AbstractC0206p0 mo280a(Class cls) {
        Application application = this.f875d;
        if (application != null) {
            if (AbstractC0175a.class.isAssignableFrom(cls)) {
                try {
                    AbstractC0206p0 abstractC0206p0 = (AbstractC0206p0) cls.getConstructor(Application.class).newInstance(application);
                    AbstractC3367j.m5097b(abstractC0206p0);
                    return abstractC0206p0;
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e7);
                } catch (InstantiationException e8) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e8);
                } catch (NoSuchMethodException e9) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e9);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                }
            }
            return AbstractC2064e.m3243q(cls);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
