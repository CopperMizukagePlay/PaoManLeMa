package p158u5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u5.i */
/* loaded from: classes.dex */
public abstract class AbstractC3366i {

    /* renamed from: a */
    public static final Object[] f16442a = new Object[0];

    /* renamed from: a */
    public static final Object[] m5094a(Collection collection) {
        AbstractC3367j.m5100e(collection, "collection");
        int size = collection.size();
        Object[] objArr = f16442a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            objArr2[i7] = it.next();
            if (i8 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i9 = ((i8 * 3) + 1) >>> 1;
                if (i9 <= i8) {
                    i9 = 2147483645;
                    if (i8 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i9);
                AbstractC3367j.m5099d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i8);
                AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i7 = i8;
        }
    }

    /* renamed from: b */
    public static final Object[] m5095b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        AbstractC3367j.m5100e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i7 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    AbstractC3367j.m5098c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i8 = i7 + 1;
                    objArr2[i7] = it.next();
                    if (i8 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i9 = ((i8 * 3) + 1) >>> 1;
                        if (i9 <= i8) {
                            i9 = 2147483645;
                            if (i8 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i9);
                        AbstractC3367j.m5099d(objArr2, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i8] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i8);
                        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i7 = i8;
                }
            }
        }
        return objArr;
    }
}
