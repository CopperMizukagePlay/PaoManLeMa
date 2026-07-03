package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final class C0177b {

    /* renamed from: a */
    public final HashMap f820a = new HashMap();

    /* renamed from: b */
    public final HashMap f821b;

    public C0177b(HashMap hashMap) {
        this.f821b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0201n enumC0201n = (EnumC0201n) entry.getValue();
            List list = (List) this.f820a.get(enumC0201n);
            if (list == null) {
                list = new ArrayList();
                this.f820a.put(enumC0201n, list);
            }
            list.add((C0179c) entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m413a(List list, InterfaceC0213t interfaceC0213t, EnumC0201n enumC0201n, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0179c c0179c = (C0179c) list.get(size);
                Method method = c0179c.f832b;
                try {
                    int i7 = c0179c.f831a;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                method.invoke(obj, interfaceC0213t, enumC0201n);
                            }
                        } else {
                            method.invoke(obj, interfaceC0213t);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException("Failed to call observer method", e8.getCause());
                }
            }
        }
    }
}
