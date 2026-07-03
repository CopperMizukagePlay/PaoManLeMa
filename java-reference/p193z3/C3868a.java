package p193z3;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.paoman.lema.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z3.a */
/* loaded from: classes.dex */
public final class C3868a {

    /* renamed from: d */
    public static volatile C3868a f18128d;

    /* renamed from: e */
    public static final Object f18129e = new Object();

    /* renamed from: c */
    public final Context f18132c;

    /* renamed from: b */
    public final HashSet f18131b = new HashSet();

    /* renamed from: a */
    public final HashMap f18130a = new HashMap();

    public C3868a(Context context) {
        this.f18132c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C3868a m5885c(Context context) {
        if (f18128d == null) {
            synchronized (f18129e) {
                try {
                    if (f18128d == null) {
                        f18128d = new C3868a(context);
                    }
                } finally {
                }
            }
        }
        return f18128d;
    }

    /* renamed from: a */
    public final void m5886a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f18132c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f18131b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC3869b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m5887b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* renamed from: b */
    public final Object m5887b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f18130a;
        if (AbstractC3393k.m5153x()) {
            try {
                AbstractC3393k.m5137h(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    InterfaceC3869b interfaceC3869b = (InterfaceC3869b) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> mo411a = interfaceC3869b.mo411a();
                    if (!mo411a.isEmpty()) {
                        for (Class cls2 : mo411a) {
                            if (!hashMap.containsKey(cls2)) {
                                m5887b(cls2, hashSet);
                            }
                        }
                    }
                    obj = interfaceC3869b.mo412b(this.f18132c);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }
}
