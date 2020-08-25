PROGRAM SineTheta
  IMPLICIT NONE
  DOUBLE PRECISION :: sum, x, a
  INTEGER :: k
  
  PRINT *, "Enter value of Theta : "
  READ *, x
  
  sum = 0.0d0
  k = 0
  a = x ! initial value of a is the term for n=0.
  DO 
     sum = sum + a 
     !     next term is ...
     k = k+1
     a = a *(-x*x) / ((2*k+1)*(2*k))
     IF (sum + a == sum) EXIT
  ENDDO

  PRINT *, "The sum of Taylor series for Sin(theta) for theta =  ", x, " = ", sum
  PRINT *, "The correct value is ", SIN(x)
  
END PROGRAM SineTheta

