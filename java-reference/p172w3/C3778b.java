package p172w3;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0194j0;
import androidx.lifecycle.AbstractC0206p0;
import androidx.lifecycle.C0198l0;
import androidx.lifecycle.C0212s0;
import androidx.lifecycle.EnumC0201n;
import androidx.lifecycle.InterfaceC0191i;
import androidx.lifecycle.InterfaceC0209r;
import androidx.lifecycle.InterfaceC0213t;
import androidx.lifecycle.InterfaceC0214t0;
import com.paoman.lema.MainActivity;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p001a0.AbstractC0094y0;
import p008b.AbstractActivityC0245m;
import p008b.C0235h;
import p053g5.C1687f;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w3.b */
/* loaded from: classes.dex */
public final class C3778b implements InterfaceC0209r {

    /* renamed from: e */
    public final /* synthetic */ int f17914e;

    /* renamed from: f */
    public final Object f17915f;

    public /* synthetic */ C3778b(int i7, Object obj) {
        this.f17914e = i7;
        this.f17915f = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0209r
    /* renamed from: c */
    public final void mo454c(InterfaceC0213t interfaceC0213t, EnumC0201n enumC0201n) {
        switch (this.f17914e) {
            case 0:
                InterfaceC3782f interfaceC3782f = (InterfaceC3782f) this.f17915f;
                if (enumC0201n == EnumC0201n.ON_CREATE) {
                    interfaceC0213t.mo415g().m473f(this);
                    Bundle m5777b = interfaceC3782f.mo520b().m5777b("androidx.savedstate.Restarter");
                    if (m5777b != null) {
                        ArrayList<String> stringArrayList = m5777b.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            int size = stringArrayList.size();
                            int i7 = 0;
                            while (i7 < size) {
                                String str = stringArrayList.get(i7);
                                i7++;
                                String str2 = str;
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str2, false, C3778b.class.getClassLoader()).asSubclass(InterfaceC3779c.class);
                                    AbstractC3367j.m5097b(asSubclass);
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            AbstractC3367j.m5097b(newInstance);
                                            if (interfaceC3782f instanceof InterfaceC0214t0) {
                                                LinkedHashMap linkedHashMap = ((AbstractActivityC0245m) ((InterfaceC0214t0) interfaceC3782f)).m522e().f876a;
                                                C3781e mo520b = interfaceC3782f.mo520b();
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String str3 = (String) it.next();
                                                    AbstractC3367j.m5100e(str3, "key");
                                                    AbstractC0206p0 abstractC0206p0 = (AbstractC0206p0) linkedHashMap.get(str3);
                                                    if (abstractC0206p0 != null) {
                                                        AbstractC0194j0.m456a(abstractC0206p0, mo520b, interfaceC3782f.mo415g());
                                                    }
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    mo520b.m5788m();
                                                }
                                            } else {
                                                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + interfaceC3782f).toString());
                                            }
                                        } catch (Exception e7) {
                                            throw new RuntimeException(AbstractC2487d.m4058v("Failed to instantiate ", str2), e7);
                                        }
                                    } catch (NoSuchMethodException e8) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                                    }
                                } catch (ClassNotFoundException e9) {
                                    throw new RuntimeException(AbstractC0094y0.m185l("Class ", str2, " wasn't found"), e9);
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                new HashMap();
                InterfaceC0191i[] interfaceC0191iArr = (InterfaceC0191i[]) this.f17915f;
                if (interfaceC0191iArr.length <= 0) {
                    if (interfaceC0191iArr.length <= 0) {
                        return;
                    }
                    InterfaceC0191i interfaceC0191i = interfaceC0191iArr[0];
                    throw null;
                }
                InterfaceC0191i interfaceC0191i2 = interfaceC0191iArr[0];
                throw null;
            case 2:
                if (enumC0201n == EnumC0201n.ON_CREATE) {
                    interfaceC0213t.mo415g().m473f(this);
                    C0198l0 c0198l0 = (C0198l0) this.f17915f;
                    if (!c0198l0.f853b) {
                        Bundle m5777b2 = c0198l0.f852a.m5777b("androidx.lifecycle.internal.SavedStateHandlesProvider");
                        Bundle m5138i = AbstractC3393k.m5138i((C1687f[]) Arrays.copyOf(new C1687f[0], 0));
                        Bundle bundle = c0198l0.f854c;
                        if (bundle != null) {
                            m5138i.putAll(bundle);
                        }
                        if (m5777b2 != null) {
                            m5138i.putAll(m5777b2);
                        }
                        c0198l0.f854c = m5138i;
                        c0198l0.f853b = true;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0201n).toString());
            default:
                MainActivity mainActivity = (MainActivity) this.f17915f;
                if (mainActivity.f953i == null) {
                    C0235h c0235h = (C0235h) mainActivity.getLastNonConfigurationInstance();
                    if (c0235h != null) {
                        mainActivity.f953i = c0235h.f919a;
                    }
                    if (mainActivity.f953i == null) {
                        mainActivity.f953i = new C0212s0(0);
                    }
                }
                mainActivity.f18075e.m473f(this);
                return;
        }
    }
}
