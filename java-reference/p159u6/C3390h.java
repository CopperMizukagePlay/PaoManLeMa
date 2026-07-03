package p159u6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u6.h */
/* loaded from: classes.dex */
public final class C3390h implements InvocationHandler {

    /* renamed from: a */
    public final ArrayList f16465a;

    /* renamed from: b */
    public boolean f16466b;

    /* renamed from: c */
    public String f16467c;

    public C3390h(ArrayList arrayList) {
        this.f16465a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC3367j.m5100e(obj, "proxy");
        AbstractC3367j.m5100e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC3367j.m5096a(name, "supports") && AbstractC3367j.m5096a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC3367j.m5096a(name, "unsupported") && AbstractC3367j.m5096a(Void.TYPE, returnType)) {
            this.f16466b = true;
            return null;
        }
        boolean m5096a = AbstractC3367j.m5096a(name, "protocols");
        ArrayList arrayList = this.f16465a;
        if (m5096a && objArr.length == 0) {
            return arrayList;
        }
        if ((AbstractC3367j.m5096a(name, "selectProtocol") || AbstractC3367j.m5096a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i7 = 0;
                    while (true) {
                        Object obj3 = list.get(i7);
                        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (arrayList.contains(str)) {
                            this.f16467c = str;
                            return str;
                        }
                        if (i7 == size) {
                            break;
                        }
                        i7++;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f16467c = str2;
                return str2;
            }
        }
        if ((AbstractC3367j.m5096a(name, "protocolSelected") || AbstractC3367j.m5096a(name, "selected")) && objArr.length == 1) {
            Object obj4 = objArr[0];
            AbstractC3367j.m5098c(obj4, "null cannot be cast to non-null type kotlin.String");
            this.f16467c = (String) obj4;
            return null;
        }
        return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
    }
}
