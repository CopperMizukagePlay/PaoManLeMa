package p023c5;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.paoman.lema.R;
import java.util.ArrayList;
import p001a0.C0019e1;
import p022c4.C0392b;
import p022c4.C0399i;
import p022c4.C0401k;
import p022c4.C0404n;
import p022c4.C0406p;
import p031d5.C0502b;
import p031d5.C0507g;
import p031d5.RunnableC0504d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.p */
/* loaded from: classes.dex */
public final class C0424p implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ int f1447a;

    /* renamed from: b */
    public final /* synthetic */ Object f1448b;

    public /* synthetic */ C0424p(int i7, Object obj) {
        this.f1447a = i7;
        this.f1448b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015a  */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, c5.b] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        C0401k c0401k;
        C0404n c0404n;
        C0404n c0404n2;
        int i7 = this.f1447a;
        Object obj = this.f1448b;
        switch (i7) {
            case 0:
                C0425q c0425q = (C0425q) obj;
                C0019e1 c0019e1 = c0425q.f1458j;
                C0507g c0507g = c0425q.f1449a;
                int i8 = message.what;
                if (i8 == R.id.zxing_decode) {
                    C0433y c0433y = (C0433y) message.obj;
                    Handler handler = c0425q.f1453e;
                    long currentTimeMillis = System.currentTimeMillis();
                    Rect rect = c0425q.f1454f;
                    c0433y.f1475d = rect;
                    C0430v c0430v = c0433y.f1472a;
                    int i9 = c0430v.f1467b;
                    if (rect == null) {
                        c0401k = null;
                    } else {
                        int i10 = c0433y.f1474c;
                        byte[] bArr = c0430v.f1466a;
                        int i11 = c0430v.f1468c;
                        if (i10 != 90) {
                            if (i10 != 180) {
                                if (i10 == 270) {
                                    int i12 = i9 * i11;
                                    byte[] bArr2 = new byte[i12];
                                    int i13 = i12 - 1;
                                    for (int i14 = 0; i14 < i9; i14++) {
                                        for (int i15 = i11 - 1; i15 >= 0; i15--) {
                                            bArr2[i13] = bArr[(i15 * i9) + i14];
                                            i13--;
                                        }
                                    }
                                    c0430v = new C0430v(bArr2, i11, i9);
                                }
                            } else {
                                int i16 = i9 * i11;
                                byte[] bArr3 = new byte[i16];
                                int i17 = i16 - 1;
                                for (int i18 = 0; i18 < i16; i18++) {
                                    bArr3[i17] = bArr[i18];
                                    i17--;
                                }
                                c0430v = new C0430v(bArr3, i9, i11);
                            }
                        } else {
                            byte[] bArr4 = new byte[i9 * i11];
                            int i19 = 0;
                            for (int i20 = 0; i20 < i9; i20++) {
                                for (int i21 = i11 - 1; i21 >= 0; i21--) {
                                    bArr4[i19] = bArr[(i21 * i9) + i20];
                                    i19++;
                                }
                            }
                            c0430v = new C0430v(bArr4, i11, i9);
                        }
                        Rect rect2 = c0433y.f1475d;
                        byte[] bArr5 = c0430v.f1466a;
                        int i22 = c0430v.f1467b;
                        int width = rect2.width();
                        int height = rect2.height();
                        byte[] bArr6 = new byte[width * height];
                        int i23 = (rect2.top * i22) + rect2.left;
                        for (int i24 = 0; i24 < height; i24++) {
                            System.arraycopy(bArr5, i23, bArr6, i24 * width, width);
                            i23 += i22;
                        }
                        c0401k = new C0401k(bArr6, width, height, width, height);
                    }
                    if (c0401k != null) {
                        C0421m c0421m = c0425q.f1452d;
                        C0392b mo902b = c0421m.mo902b(c0401k);
                        C0399i c0399i = c0421m.f1444a;
                        c0421m.f1445b.clear();
                        try {
                            if (c0399i != null) {
                                try {
                                    if (c0399i.f1364b == null) {
                                        c0399i.m877c(null);
                                    }
                                    c0404n2 = c0399i.m876b(mo902b);
                                } catch (Exception unused) {
                                    c0404n = null;
                                    c0399i.reset();
                                    c0404n2 = c0404n;
                                    if (c0404n2 == null) {
                                    }
                                    if (handler != null) {
                                    }
                                    c0507g.f1811h.post(new RunnableC0504d(c0507g, c0019e1, 0));
                                    return true;
                                }
                            } else {
                                c0404n = null;
                                try {
                                    c0399i.m877c(null);
                                    c0404n2 = c0399i.m876b(mo902b);
                                } catch (Exception unused2) {
                                    c0399i.reset();
                                    c0404n2 = c0404n;
                                    if (c0404n2 == null) {
                                    }
                                    if (handler != null) {
                                    }
                                    c0507g.f1811h.post(new RunnableC0504d(c0507g, c0019e1, 0));
                                    return true;
                                }
                            }
                            c0399i.reset();
                            if (c0404n2 == null) {
                                Log.d("q", "Found barcode in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                                if (handler != null) {
                                    ?? obj2 = new Object();
                                    obj2.f1392a = c0404n2;
                                    obj2.f1393b = c0433y;
                                    Message obtain = Message.obtain(handler, R.id.zxing_decode_succeeded, obj2);
                                    obtain.setData(new Bundle());
                                    obtain.sendToTarget();
                                }
                            } else if (handler != null) {
                                Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
                            }
                            if (handler != null) {
                                C0421m c0421m2 = c0425q.f1452d;
                                c0421m2.getClass();
                                ArrayList arrayList = new ArrayList(c0421m2.f1445b);
                                ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size = arrayList.size();
                                int i25 = 0;
                                while (i25 < size) {
                                    Object obj3 = arrayList.get(i25);
                                    i25++;
                                    C0406p c0406p = (C0406p) obj3;
                                    float f7 = 1;
                                    float f8 = c0406p.f1390a * f7;
                                    Rect rect3 = c0433y.f1475d;
                                    float f9 = f8 + rect3.left;
                                    float f10 = (c0406p.f1391b * f7) + rect3.top;
                                    if (c0433y.f1476e) {
                                        f9 = i9 - f9;
                                    }
                                    arrayList2.add(new C0406p(f9, f10));
                                }
                                Message.obtain(handler, R.id.zxing_possible_result_points, arrayList2).sendToTarget();
                            }
                            c0507g.f1811h.post(new RunnableC0504d(c0507g, c0019e1, 0));
                            return true;
                        } catch (Throwable th) {
                            c0399i.reset();
                            throw th;
                        }
                    }
                    c0404n = null;
                    c0404n2 = c0404n;
                    if (c0404n2 == null) {
                    }
                    if (handler != null) {
                    }
                    c0507g.f1811h.post(new RunnableC0504d(c0507g, c0019e1, 0));
                    return true;
                }
                int i26 = 0;
                if (i8 != R.id.zxing_preview_failed) {
                    return true;
                }
                c0507g.f1811h.post(new RunnableC0504d(c0507g, c0019e1, i26));
                return true;
            default:
                int i27 = message.what;
                C0502b c0502b = (C0502b) obj;
                c0502b.getClass();
                if (i27 == 1) {
                    c0502b.m1085b();
                    return true;
                }
                return false;
        }
    }
}
