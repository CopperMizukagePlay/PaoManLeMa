package p008b;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Log;
import android.util.LongSparseArray;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.paoman.lema.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p001a0.C0019e1;
import p022c4.C0404n;
import p022c4.EnumC0405o;
import p023c5.C0410b;
import p023c5.C0419k;
import p023c5.C0430v;
import p023c5.C0433y;
import p066i3.AbstractC2067b;
import p191z0.ViewOnAttachStateChangeListenerC3864c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0225c implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f902e;

    /* renamed from: f */
    public final /* synthetic */ Object f903f;

    /* renamed from: g */
    public final /* synthetic */ Object f904g;

    public /* synthetic */ RunnableC0225c(int i7, Object obj, Object obj2) {
        this.f902e = i7;
        this.f903f = obj;
        this.f904g = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0142  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        Intent intent;
        byte[] bArr;
        Map map;
        int i7 = this.f902e;
        Object obj = this.f904g;
        Object obj2 = this.f903f;
        switch (i7) {
            case 0:
                MainActivity mainActivity = (MainActivity) obj2;
                mainActivity.f18075e.m468a(new C0227d((C0236h0) obj, mainActivity));
                return;
            case 1:
                C0410b c0410b = (C0410b) obj;
                C0404n c0404n = c0410b.f1392a;
                C0419k c0419k = (C0419k) ((C0019e1) obj2).f109e;
                CaptureActivity captureActivity = c0419k.f1431a;
                int i8 = 0;
                if (c0419k.f1434d) {
                    C0433y c0433y = c0410b.f1393b;
                    C0430v c0430v = c0433y.f1472a;
                    int i9 = c0433y.f1474c;
                    Rect rect = new Rect(0, 0, c0430v.f1467b, c0430v.f1468c);
                    YuvImage yuvImage = new YuvImage(c0430v.f1466a, c0433y.f1473b, c0430v.f1467b, c0430v.f1468c, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    if (i9 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i9);
                        decodeByteArray = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                    }
                    try {
                        File createTempFile = File.createTempFile("barcodeimage", ".jpg", captureActivity.getCacheDir());
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        str = createTempFile.getAbsolutePath();
                    } catch (IOException e7) {
                        Log.w("k", "Unable to create temporary file and store bitmap! " + e7);
                    }
                    intent = new Intent("com.google.zxing.client.android.SCAN");
                    intent.addFlags(524288);
                    intent.putExtra("SCAN_RESULT", c0404n.f1371a);
                    intent.putExtra("SCAN_RESULT_FORMAT", c0404n.f1374d.toString());
                    bArr = c0404n.f1372b;
                    if (bArr != null && bArr.length > 0) {
                        intent.putExtra("SCAN_RESULT_BYTES", bArr);
                    }
                    map = c0404n.f1375e;
                    if (map != null) {
                        EnumC0405o enumC0405o = EnumC0405o.f1384m;
                        if (map.containsKey(enumC0405o)) {
                            intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", map.get(enumC0405o).toString());
                        }
                        Number number = (Number) map.get(EnumC0405o.f1376e);
                        if (number != null) {
                            intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                        }
                        String str2 = (String) map.get(EnumC0405o.f1378g);
                        if (str2 != null) {
                            intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
                        }
                        Iterable iterable = (Iterable) map.get(EnumC0405o.f1377f);
                        if (iterable != null) {
                            Iterator it = iterable.iterator();
                            while (it.hasNext()) {
                                intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i8, (byte[]) it.next());
                                i8++;
                            }
                        }
                    }
                    if (str != null) {
                        intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
                    }
                    captureActivity.setResult(-1, intent);
                    c0419k.m900a();
                    return;
                }
                str = null;
                intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.addFlags(524288);
                intent.putExtra("SCAN_RESULT", c0404n.f1371a);
                intent.putExtra("SCAN_RESULT_FORMAT", c0404n.f1374d.toString());
                bArr = c0404n.f1372b;
                if (bArr != null) {
                    intent.putExtra("SCAN_RESULT_BYTES", bArr);
                }
                map = c0404n.f1375e;
                if (map != null) {
                }
                if (str != null) {
                }
                captureActivity.setResult(-1, intent);
                c0419k.m900a();
                return;
            default:
                AbstractC2067b.m3286k((ViewOnAttachStateChangeListenerC3864c) obj2, (LongSparseArray) obj);
                return;
        }
    }
}
