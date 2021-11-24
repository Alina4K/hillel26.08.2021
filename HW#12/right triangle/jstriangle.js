function triangle(f) {
for (var i = 0; i <= f; i++) {
  for (var j = f - 1; j >= i; j--) {
    document.write('↯');
}
   document.write('<br>');
} }
triangle(14)

